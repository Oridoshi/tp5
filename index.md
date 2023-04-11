<!DOCTYPE html> 
<html lang="fr"> 
	<head> 
		<meta charset="utf-8" /> 
		<title>TABLEAU</title> 
		<link rel="shortcut icon" href="../../CSS/Image/HTML.png" type="image/x-icon">
		<link rel="stylesheet" href="../../CSS/abécédaire.css" type="text/css" />
		<link rel="stylesheet" href="../../CSS/tableau.css" type="text/css" />
		<meta name="Author" lang="fr" content="Tom Dunet"/>
		<meta name="Language" content="fr"/>
	</head>
	<body>
		<header>
			<h1>Tableau</h1>
		</header>
		
		
		<nav>
			<h2>Sommaire</h2>
			<ul>
				<li><a href="../../index.html">Menu</a></li>
				<li><a href="#TDB">Tableau de base</a></li>
				<li><a href="#TAT">Tableau avec titre</a></li>
				<li><a href="#TAB">Tableau avec bordure</a></li>
				<li><a href="#TAEP">Tableau avec entête et pied de page</a></li>
				<li><a href="#TAS">Tableau avec style</a></li>
				<li><a href="#TABC">Tableau avec bordure commune</a></li>
				<li><a href="#TACELD">Tableau avec Colonne et ligne différente</a></li>
			</ul>
		</nav>
		
		<hr>

		<!--Tableau de base-->
		<Section>
			<h2>Tableau de base</h2>
			<p>
				Les tableau ont de nombreuse posibilité dans leur conception il peuvent être plus ou moins grand avoir plus ou moins de ligne et de colonne avoir des titre etc.<br>
				Nous allons voir comment faire des tableau avec leur différent argument.<br>
				Voici un tableau de base : 
			</p> 
			<exemple>
				<code>
					<pre>
<span class="balise"><span class="ponctu">&lt;</span>table<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
<span class="balise"><span class="ponctu">&lt;/</span>table<span class="ponctu">></span></span>				
					</pre>
				</code>
				<web>
					<table>
						<tr>
							<td>Col 1Lig 1</td>
							<td>Col 2Lig 1</td>
						</tr>
						<tr>
							<td>Col 1Lig 2</td>
							<td>Col 2Lig 2</td>
						</tr>
					</table>
				</web>
			</exemple>
			<hr>
		</Section>

		<!--Tableau avec titre-->
		<section>
			<h2 id="TAT">Tableau avec titre</h2>
			<p>
				Les tableau peuvent avoir des titre pour les case pour la première ligne ont met les titre dans un thead<br>
				Voici un exemple : 
			</p> 
			<exemple>
				<code>
					<pre>
<span class="balise"><span class="ponctu">&lt;</span>table<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>thead<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>th<span class="ponctu">></span></span>Col 1Lig 1 Titre<span class="balise"><span class="ponctu">&lt;/</span>th<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>th<span class="ponctu">></span></span>Col 2Lig 1 Titre<span class="balise"><span class="ponctu">&lt;/</span>th<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>thead<span class="ponctu">></span></span>

	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>th<span class="ponctu">></span></span>Col 1Lig 2 Titre<span class="balise"><span class="ponctu">&lt;/</span>th<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
<span class="balise"><span class="ponctu">&lt;/</span>table<span class="ponctu">></span></span>				
					</pre>
				</code>
				<web>
					<table>
						<thead>
							<tr>
								<th>Col 1Lig 1 Titre</th>
								<th>Col 2Lig 1 Titre</th>
							</tr>
						</thead>
						<tr>
							<th>Col 1Lig 2 Titre</th>
							<td>Col 2Lig 2</td>
						</tr>
					</table>
				</web>
			</exemple>
			<p>Comme nous pouvont le voir la première ligne qui ne contient que des titre est dans un "thead" c'est le cas aussi si on le fais a la fin du tableau mais cette fois la balise s'appeleras "tfoot".</p>
			<hr>
		</section>
		<!--Tableau avec Bordure-->
		<section>
			<h2 id="TAB">Tableau avec bordure</h2>
			<p>
				Les tableau peuvent avoir aussi des bordure<br>
				Voici un exemple : 
			</p> 
			<exemple>
				<code>
					<pre>
<span class="balise"><span class="ponctu">&lt;</span>table<span class="ponctu"> <span class="argu2">border</span><span class="ponctu2">=</span><span class="option">"1px"</span> <span class="argu">style</span><span class="ponctu2">=</span><span class="option">"border-color: aliceblue;"</span> ></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
<span class="balise"><span class="ponctu">&lt;/</span>table<span class="ponctu">></span></span>				
					</pre>
				</code>
				<web>
					<table border="1px" style="border-color: aliceblue;">
						<tr>
							<td>Col 1Lig 1</td>
							<td>Col 2Lig 1</td>
						</tr>
						<tr>
							<td>Col 1Lig 2</td>
							<td>Col 2Lig 2</td>
						</tr>
					</table>
				</web>
			</exemple>
			<p>
				Le border mis en dure comme précedement vas l'appliquer a tout les argument du tableau.<br>
				Les bordure et le reste du style peuvent être définie dans le CSS et nous définiron le celui-ci dans le CSS a partire de maintenant.<br>
				Voici un exemple : 
			</p>
			<exemple>
				<code>
					<pre>
<span class="balise"><span class="ponctu">&lt;</span>table <span class="argu">id</span><span class="ponctu2">=</span><span class="option">"tableau1"</span><span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
<span class="balise"><span class="ponctu">&lt;/</span>table<span class="ponctu">></span></span>				
					</pre>

					<!--CSS-->
					<pre>
<span class="cssdef">#tableau1{</span>
	<span class="argu">border<span class="ponctu2">: <span class="valeur">1px</span><span class="ponctu2">;</span></span>
	<span class="argu">border-color<span class="ponctu2">: </span></span><span class="option">aliceblue</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>  

<span class="cssdef">#tableau1 td{</span>
	<span class="argu">border<span class="ponctu2">: </span><span class="valeur">1px</span><span class="ponctu2">;</span></span>
	<span class="argu">border-color<span class="ponctu2">: </span><span class="option">aliceblue</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>
					</pre>
				</code>
				<web>
					<table id="tableau1">
						<tr>
							<td>Col 1Lig 1</td>
							<td>Col 2Lig 1</td>
						</tr>
						<tr>
							<td>Col 1Lig 2</td>
							<td>Col 2Lig 2</td>
						</tr>
					</table>
				</web>
			</exemple>
			<p>
				Ont peut voire que l'on obtient la même chose que précédement mais cette fois-ci avec du CSS.
			</p>
			<hr>
		</section>

		<!--Tableau avec Entête et Pied de page-->
		<section> 
			<h2 id="TAEP">Tableau avec entête et pied de page</h2>
			<p>
				Les tableau peuvent avoir des entête et des pied de page.<br>
				Précédement ont a juste utiliser le thead pour mettre la première ligne avec des titre a l'intérieur pour pouvoir ranger maintenant nous allons utiliser le tbody afin de pouvoir ranger le corp du tableau.<br>
				Voici un exemple : 
			</p> 
			<exemple>
				<code>
					<pre>
<span class="balise"><span class="ponctu">&lt;</span>table<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>caption<span class="ponctu">></span><span class="ponctu2">Entête</span><span class="ponctu">&lt;/</span>caption<span class="ponctu">></span></span>
	
	<span class="balise"><span class="ponctu">&lt;</span>tbody<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tbody<span class="ponctu">></span></span>
<span class="balise"><span class="ponctu">&lt;/</span>table<span class="ponctu">></span></span>				
					</pre>
				</code>
				<web>
					<table>
						<caption>Entête</caption>

						<tbody>
							<tr>
								<td>Col 1Lig 1</td>
								<td>Col 2Lig 1</td>
							</tr>
							<tr>
								<td>Col 1Lig 2</td>
								<td>Col 2Lig 2</td>
							</tr>
						</tbody>
					</table>
				</web>
			</exemple>
			
			<p>ATTENTION : il ne peut y avoir 1 seul &lt;caption> pour 1 tableau ont a vue juste avant comment le mettre en haut du tableau nous allons voir comment le mettre en dessous.</p>

			<exemple>
				<code>
					<pre>
<span class="balise"><span class="ponctu">&lt;</span>table<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>caption <span class="argu">style</span><span class="ponctu2">=</span><span class="option">"caption-side: bottom;"</span><span class="ponctu">></span><span class="ponctu2">Pied de page</span><span class="ponctu">&lt;/</span>caption<span class="ponctu">></span></span>
	
	<span class="balise"><span class="ponctu">&lt;</span>tbody<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tbody<span class="ponctu">></span></span>
<span class="balise"><span class="ponctu">&lt;/</span>table<span class="ponctu">></span></span>				
					</pre>
				</code>
				<web>
					<table>
						<caption style="caption-side: bottom;">Pied de page</caption>

						<tbody>
							<tr>
								<td>Col 1Lig 1</td>
								<td>Col 2Lig 1</td>
							</tr>
							<tr>
								<td>Col 1Lig 2</td>
								<td>Col 2Lig 2</td>
							</tr>
						</tbody>
					</table>
				</web>
			</exemple> 
			<p>
				Nous pouvont observer que l'entête et le pied de page est hors du tbody et du thead.
			</p>

			<hr>
		</section>

		<!--Tableau avec Style-->
		<section>
			<h2 id="TAS">Tableau avec style</h2>
			<p>
				Plusieurs style peuvent être apliquer dans un tableau<br>
				Voici un exemple : 
			</p> 
			<exemple>
				<code>
					<pre>
<span class="balise"><span class="ponctu">&lt;</span>table <span class="argu">id</span><span class="ponctu2">=</span><span class="option">"tableau2"</span><span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>thead<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>th<span class="ponctu">></span></span>Col 1Lig 1 Titre<span class="balise"><span class="ponctu">&lt;/</span>th<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>th<span class="ponctu">></span></span>Col 2Lig 1 Titre<span class="balise"><span class="ponctu">&lt;/</span>th<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;/</span>thead<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tbody<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>th<span class="ponctu">></span></span>Col 1Lig 2 Titre<span class="balise"><span class="ponctu">&lt;/</span>th<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;/</span>tbody<span class="ponctu">></span></span>
<span class="balise"><span class="ponctu">&lt;/</span>table<span class="ponctu">></span></span>				 
					</pre>

					<!--CSS-->
					<pre>
<span class="cssdef">#tableau2{</span>
	<span class="argu">background-color<span class="ponctu2">: </span><span class="option">cornflowerblue</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>  

<span class="cssdef">#tableau2 td{</span>
	<span class="argu">background-color<span class="ponctu2">: </span><span class="option">blanchedalmond</span><span class="ponctu2">;</span></span>
	<span class="argu">color<span class="ponctu2">: </span><span class="option">black</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>

<span class="cssdef">#tableau2 td{</span>
	<span class="argu">background-color<span class="ponctu2">: </span><span class="option">#95c9c4</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>
					</pre>
				</code>
				<web>
					<table id="tableau2">
						<thead>
							<tr>
								<th>Col 1Lig 1 Titre</th>
								<th>Col 2Lig 1 Titre</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th>Col 1Lig 2 Titre</th>
								<td>Col 2Lig 2</td>
							</tr>
						</tbody>
					</table>
				</web>
			</exemple> 

			<p>
				Les style peuvent être directement apliquer dans la balise et les pouvant être aplique sont les même que pour le texte soit la police, le fond comme ont a pue le voir, la taille du texte, l'alignement ...
			</p>
			<hr>
		</section>

		<!--Tableau avec Colonne et Ligne différente-->
		<section>
			<h2 id="TABC">Tableau avec bordure commune</h2>
			<p>
				Comme ont peut le voir les tablau ont des bordure différente pour chaque argument chaque section du tableau <br>
				Voici un éxemple :
			</p>
			<exemple>
				<code>
					<pre>
<span class="cssdef">#tableau3{</span>
	<span class="argu">border<span class="ponctu2">: </span><span class="valeur">2px</span> <span class="option">solid</span><span class="ponctu2">;</span></span>
	<span class="argu">border-color<span class="ponctu2">: </span><span class="option">aliceblue</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>  

<span class="cssdef">#tableau3 td{</span>
	<span class="argu">border<span class="ponctu2">: </span><span class="valeur">2px</span> <span class="option">solid</span><span class="ponctu2">;</span></span>
	<span class="argu">border-color<span class="ponctu2">: </span><span class="option">aliceblue</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>
					</pre>
				</code>
				<web>
					<table id="tableau3">
						<tr>
							<td>Col 1 Lig 1</td>
							<td>Col 2 Lig 1</td>
							<td>Col 3 Lig 1</td>
							<td>Col 4 Lig 1</td>
						</tr>
						<tr>
							<td>Col 1 Lig 2</td>
							<td>Col 2 Lig 2</td>
							<td>Col 3 Lig 2</td>
							<td>Col 4 Lig 2</td>
						</tr>
						<tr>
							<td>Col 1 Lig 3</td>
							<td>Col 2 Lig 3</td>
							<td>Col 3 Lig 3</td>
							<td>Col 4 Lig 3</td>
						</tr>
					</table>
				</web>
			</exemple>
			<p>
				Mais il est aussi possible de faire en sorte que les ligne ne fasse qu'un et qu'il n'y ai qu'une ligne entre chauque case au lieux de 2 grâce à border-collapse<br>
				Voici un exemple :
			</p>
			<exemple>
				<code>
					<pre>
<span class="cssdef">#tableau4{</span>
	<span class="argu">border<span class="ponctu2">: </span><span class="valeur">2px</span> <span class="option">solid</span><span class="ponctu2">;</span></span>
	<span class="argu">border-color<span class="ponctu2">: </span><span class="option">aliceblue</span><span class="ponctu2">;</span></span>
	<span class="argu">border-collapse<span class="ponctu2">: </span><span class="option">collapse</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>  

<span class="cssdef">#tableau4 td{</span>
	<span class="argu">border<span class="ponctu2">: </span><span class="valeur">2px</span> <span class="option">solid</span><span class="ponctu2">;</span></span>
	<span class="argu">border-color<span class="ponctu2">: </span><span class="option">aliceblue</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>
					</pre>
				</code>
				<web>
					<table id="tableau4">
						<tr>
							<td>Col 1 Lig 1</td>
							<td>Col 2 Lig 1</td>
							<td>Col 3 Lig 1</td>
							<td>Col 4 Lig 1</td>
						</tr>
						<tr>
							<td>Col 1 Lig 2</td>
							<td>Col 2 Lig 2</td>
							<td>Col 3 Lig 2</td>
							<td>Col 4 Lig 2</td>
						</tr>
						<tr>
							<td>Col 1 Lig 3</td>
							<td>Col 2 Lig 3</td>
							<td>Col 3 Lig 3</td>
							<td>Col 4 Lig 3</td>
						</tr>
					</table>
				</web>
			</exemple>
			<hr>
		</section>

		<!--Tableau avec Colonne et Ligne différente-->
		<section>
			<h2 id="TACELD">Tableau avec Colonne et ligne différente</h2>
			<p>
				lors de la création des ligne et des colonne ont peut faire en sorte que celle-ci valent n (n etant la valeur que l'utilisateur choisie) donc nous allons voir comment faire.<br>
				Voici un exemple : 
			</p>
			<exemple>
				<code>
					<pre>
<span class="balise"><span class="ponctu">&lt;</span>table <span class="argu">id</span><span class="ponctu2">=</span><span class="option">"tableau4"</span><span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>thead<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1 Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 2 Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 3 Lig 1<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;/</span>thead<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;</span>tbody<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td <span class="argu">colspan</span><span class="ponctu2">=</span><span class="option">"2"</span><span class="ponctu">></span></span>Col 1 et 2 Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 3 Lig 2<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1 Lig 3<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td <span class="argu">rowspan</span><span class="ponctu2">=</span><span class="option">"2"</span><span class="ponctu">></span></span>Col 2 Lig 3 et 4<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 3 Lig 3<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 1 Lig 4<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
			<span class="balise"><span class="ponctu">&lt;</span>td<span class="ponctu">></span></span>Col 3 Lig 4<span class="balise"><span class="ponctu">&lt;/</span>td<span class="ponctu">></span></span>
		<span class="balise"><span class="ponctu">&lt;</span>tr<span class="ponctu">></span></span>
	<span class="balise"><span class="ponctu">&lt;/</span>tbody<span class="ponctu">></span></span>
<span class="balise"><span class="ponctu">&lt;/</span>table<span class="ponctu">></span></span>				 
					</pre>

					<!--CSS-->
					<pre>
<span class="cssdef">#tableau4{</span>
	<span class="argu">border<span class="ponctu2">: </span><span class="valeur">2px</span> <span class="option">solid</span><span class="ponctu2">;</span></span>
	<span class="argu">border-color<span class="ponctu2">: </span><span class="option">aliceblue</span><span class="ponctu2">;</span></span>
	<span class="argu">border-collapse<span class="ponctu2">: </span><span class="option">collapse</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>  

<span class="cssdef">#tableau4 td{</span>
	<span class="argu">border<span class="ponctu2">: </span><span class="valeur">2px</span> <span class="option">solid</span><span class="ponctu2">;</span></span>
	<span class="argu">border-color<span class="ponctu2">: </span><span class="option">aliceblue</span><span class="ponctu2">;</span></span>
<span class="cssdef">}</span>
					</pre>
				</code>
				<web>
					<table id="tableau4">
						<thead>
							<tr>
								<td>Col 1 Lig 1</td>
								<td>Col 2 Lig 1</td>
								<td>Col 3 Lig 1</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td colspan="2">Col 1 et 2 Lig 2</td>
								<td>Col 3 Lig 2</td>
							</tr>
							<tr>
								<td>Col 1 et 2 Lig 3</td>
								<td rowspan="2">Col 2 Lig 3 et 4</td>
								<td>Col 3 Lig 3</td>
							</tr>
							<tr>
								<td>Col 1 Lig 4</td>
								<td>Col 3 Lig 4</td>
							</tr>
						</tbody>
					</table>
				</web>
			</exemple>
			<p>
				Ont peut utiliser colspan et rowspan dans a même ligne afin de faire en sort qu'un argument puissent faire n ligne et n colonne a la fois.
			</p>
		</section>
	</body>
</html>
