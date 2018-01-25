<%@include file="../../includes/head.jsp"%>
</head>

<body>

	<div class="container">
		<%@include file="../../includes/header.jsp"%>


		<nav>
			<div class="navbar navbar-default">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Arquitectura</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Inicio</a></li>
					<li><a href="contacto">Contacto</a></li>
					<li><a href="obras">Obras</a></li>
				</ul>
			</div>
		</nav>

		<section>
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">

					<div class="item active">
						<img src="img/fotos/4.jpg" alt="imagen1" width="600" heght="600">
						<div class="carousel-caption">
							<h3>Vivienda Unifamiliar</h3>
							<p>Club de Campo Las Perdices - Virrey del Pino - La Matanza
								- Sup. cubierta 260 m2</p>
						</div>
					</div>

					<div class="item">
						<img src="img/fotos2/pers3.jpg" alt="imagen1">
						<div class="carousel-caption">
							<h3>Vivienda Unifamiliar</h3>
							<p>La Alameda Barrio Privado & Spa - Sup. cubierta 260 m2</p>
						</div>
					</div>

					<div class="item">
						<img src="img/fotosvivienda/SAM_3190.JPG" alt="imagen3">
						<div class="carousel-caption">
							<h3>Vivienda Unifamiliar</h3>
							<p>Tokio 2950 - Isidro Casanova - Sup. cubierta 280 m2</p>
						</div>
					</div>


					<!-- Left and right controls -->
					<a class="left carousel-control" href="#myCarousel" role="button"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Anterior</span>
					</a> <a class="right carousel-control" href="#myCarousel" role="button"
						data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Siguiente</span>
					</a>
				</div>
			</div>
		</section>
		<footer>
			<div class="panel-footer">
				<h5>Correo electr&oacutenico: estudio.greco@live.com.ar</h5>
				<h5>Tel&eacutefono: 11 - 6041 - 4847</h5>
			</div>
		</footer>


	</div>



</body>
</html>


