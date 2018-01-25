package ar.com.arquitectura.controladores;

import java.util.Properties;

import javax.inject.Inject;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.com.arquitectura.dao.ContactoDao;
import ar.com.arquitectura.dao.UsuarioDao;
import ar.com.arquitectura.modelo.Contacto;
import ar.com.arquitectura.modelo.Usuario;

@Controller
public class ControladorContacto {

	static String emailPara, emailAsunto, emailMensaje;
	static final String emailFromRecipient = "javapruebaenvio@gmail.com";

	@Inject
	private UsuarioDao usuarioDao;
	@Inject
	private ContactoDao contactoDao;

	@RequestMapping(path = "/contacto")
	public ModelAndView irAContacto() {
		ModelMap modelo = new ModelMap();
		Contacto contacto = new Contacto();

		modelo.put("contacto", contacto);

		return new ModelAndView("contacto", modelo);
	}

	@RequestMapping(path = "/procesar-contacto", method = RequestMethod.POST)
	public ModelAndView procesaContacto(@ModelAttribute("contacto") Contacto contacto) {
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		sender.setPort(587);
		sender.setUsername("javapruebaenvio@gmail.com");
		sender.setPassword("ciclon18");
		sender.setHost("smtp.gmail.com");
		
		Properties props = System.getProperties();
		props.put("mail.smtp.user","javapruebaenvio@gmail.com"); 
	    props.put("mail.smtp.password", "ciclon18");
	    props.put("mail.smtp.host", "smtp.gmail.com"); 
	    props.put("mail.smtp.port", 587); 
	    //props.put("mail.debug", "true"); 
	    props.put("mail.smtp.auth", "true"); 
	    props.put("mail.smtp.starttls.enable","true"); 
	    props.put("mail.smtp.EnableSSL.enable","true");
	    sender.setJavaMailProperties(props);
	    
		Usuario usuario = usuarioDao.buscarUsuario();
		if (contacto == null) {
			return new ModelAndView("nosuccess");
		} else {
			emailAsunto = "Contacto de " + contacto.getNombre() + " - " + contacto.getEmail();
			emailPara = usuario.getEmail();
			emailMensaje = contacto.getComentario() + "\n\n\nRespusta a: " +contacto.getEmail();
			SimpleMailMessage mensaje = new SimpleMailMessage();
			mensaje.setTo(emailPara);
			mensaje.setFrom(emailFromRecipient);
			mensaje.setSubject(emailAsunto);
			mensaje.setText(emailMensaje);
			sender.send(mensaje);
			contactoDao.guardarContacto(contacto, usuario);
			return new ModelAndView("success");
		}
	}
}
