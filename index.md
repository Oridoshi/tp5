**Nom    :** Dunet Tom
**Groupe :** A1
**Année  :** 2023
**IUT Le Havre - Cours GIT**

# Compte-rendu TP Introduction GIT
||Dans ce premier TP, on apprend à travailler avec GIT.||



## Configurer GIT
Nous allons tous commencer par configurer git en premier. Pour ce faire, nous utiliserons la commande suivante :
`git config --global user.name  <Votre Nom  >` pour changer votre nom.
`git config --global user.email <Votre Email>` pour changer votre adresse e-mail.

Nous allons également configurer l'éditeur de texte par défaut :
`git config --global core.editor votre éditeur`
Vous savez, dans mon cas, j'ai décidé d'utiliser l'éditeur VSCode (code).

Vous pouvez vérifier que toutes les modifications ont eu lieu avec la commande `git config --list`



## Créer un répértoire git
Il faut maintenant créer un répertoire où les modifications seront gérées par git, créez deux fichiers pour cela :
- un fichier courseGIT
- le fichier tp1 dans le fichier courseGIT.

Mettez-vous dans le fichier tp1, et créez votre premier dépôt git avec :
git init

Si tout se passe bien, la commande renverra le message :
_Initialiser un dépôt Git vide dans /.../courseGIT/tp1/.git/_

Vous pouvez vérifier que tout va bien avec la commande `git status`, qui vous renverra :
_dans le maître de la branche_
_Engagement initial_
_Pas besoin de valider (créer/copier des fichiers et utiliser "git add" pour les suivre)_



## Gerer les modifications d'un fichier.
Créez n'importe quel fichier, pour cet exemple nous allons créer le fichier `README.md` (le fichier que vous êtes en train de lire).
Écrivez quelque chose dans le fichier et enregistrez les modifications.

Lorsque vous utilisez la commande `git status`, vous pouvez voir que vos fichiers sont dans la catégorie **Fichiers non suivis**.
Cela signifie que git ne suit pas encore ce fichier. Pour le faire suivre :
`git add LISEZMOI.md`
(Remarque : remplacez README.md par votre nom de fichier)

Cette commande vous permettra de suivre les modifications apportées. Pour enregistrer une version différente, utilisez la commande suivante :
`git commit -m "un petit commentaire"`

Si un jour vous voulez voir toutes les versions d'un fichier, utilisez la commande `git log`.



## Ignorer certain type de fichier.
Par exemple, lorsque nous compilons un fichier java, un fichier .class est créé, ce qui ne vaut certainement pas la peine d'être enregistré avec git.
Cependant, avec la commande `git status`, il apparaît toujours comme un fichier non suivi, ce qui peut être ennuyeux si nous avons beaucoup de `.class`.

Pour ignorer ce fichier, nous pouvons modifier le fichier `.gitignore` pour ignorer les fichiers suivants :
- *.class
- *.jar
- *.war
- *.nar
- *.ear
- *.zip
- *.tar.gz
- *.rar



## Créer un compte GitHub.
Pour la première étape, je ne vous donnerai pas beaucoup de conseils, il vous suffit de vous **inscrire** sur le site [GitHub](https://github.com).
Remplissez les champs de demande et passez à l'étape suivante après avoir créé votre compte.



## Ajouté une clé SSH à votre compte GitHub.
Pour des raisons de sécurité, GitHub base ses connexions sur un système de clé publique/privée.
Vous devez récupérer votre clé SSH avec la commande `cat ~/.ssh/id_rsa.pub`, qui renverra votre clé publique.
**/!\ Vous avez deux clés, une clé privée et une clé publique, se terminant par .pub. _JAMAIS_ partager les clés privées. **

Remarque : Si vous n'avez pas de clé, utilisez la commande `ssh-keygen` pour en générer une.

Allez maintenant sur votre compte GitHub et :
- Cliquez sur votre profil
- Aller aux paramètres
- Puis en Clés SSH et GPG (Clés SSH et GPG)
- Ajouter une clé SSH (Nouvelle clé SSH)
- copié la clé dans la section "Clés"
- Donnez un titre à la séance

Enfin, authentifiez-vous à l'aide de "Ajouter une clé SSH" (une phrase de passe peut vous être demandée, c'est normal)



## Pousser un dépôt existant depuis la ligne de commande
Accédez à votre dossier tp1.
Accédez ensuite au site Web GitHub et cliquez sur Nouveau référentiel (+).
Dans le formulaire, saisissez tp1 sous Nom du référentiel.

Vous venez de créer un référentiel vide, dont le lien apparaîtra ci-dessous.

Nous voulons maintenant lier notre référentiel local au référentiel distant.
Avant de vérifier que votre dépôt local n'est pas lié avec la commande `git remote -v` : s'il n'affiche rien, tant mieux !

Maintenant, nous les enchaînons avec la commande
`git remote add origin git@github.com :<votre_utilisateur>  /tp1.git`
Remplacer bien sûr<votre_utilisateur> par vos utilisateurs.

Jusqu'à présent, nous n'avons pas vu le concept de branches dans git, nous n'entrerons donc pas dans les détails pour l'instant.
Cependant, vous devez savoir que toutes les versions que nous gardons avec différents commits sont stockées dans une seule branche.
Habituellement, cette branche sera appelée master ou main.

Pour accomplir la liaison des dépôts locaux et distants, nous devons connaître le nom de la branche. Pour cela, tapez la commande suivante : `git branch`.
Habituellement, cela vous renvoie _master_.

Il ne reste plus qu'à rendre le lien permanent et à mettre à jour le référentiel distant.
Pour cela, tapez la commande suivante : `git push -u origin master`



## Sequence de travail avec un dépôt distant
Dans la première expérience, nous avons vu des commandes de base (`git add` et `git commit -m "message"`) pour enregistrer différentes traces de différentes versions d'un projet.

Mais il y a deux commandes à synchroniser avec l'entrepôt distant :
- `git pull` télécharge et synchronise la dernière version du référentiel distant vers notre référentiel local.
- `git push` contre lui.



## Cloner un dépôt distant sur notre machine locale
Dans la section 3, nous avons appris à initialiser un référentiel localement (à l'aide de git init) puis à le synchroniser avec un répertoire distant.

La plupart du temps, cependant, nous utiliserons un mécanisme plus simple pour lier deux dépôts : le clonage.

Pour apprendre ce mécanisme, nous allons créer un nouveau dépôt sur github, que nous appellerons tp2.

Créez un nouveau répertoire tp2 sur GitHub en cochant les options suivantes :
- Ajout du fichier README.md
- ajouter .gitignore (java)

Cliquez sur Code et SSH, puis copiez la commande.

Allez ensuite dans le répertoire courseGIT et tapez :
`git clone (et copie avant la commande)`



## Inviter des  collaborateurs dans un dépôt personnel
Tout d'abord, un membre de l'équipe que je nommerai Sappho créera un dépot appelé tp3 dans son compte github avec les mêmes paramètres que tp2.
Après avoir créé un dépot, allez dans **Settings**, puis **Manage Access**, et enfin **Invite a collaborateurs**.

Demandez à votre amie (je l'appellerai Aphrodite) son nom d'utilisateur GitHub et ajoutez-le.


## Les branches
Imaginons que nous souhaitions tester une fonctionnalité dans une autre branche avant de l'intégrer dans la branche master.
Pour cela, on peut travailler sur une autre branche.

Avec la commande `git branch`, vous pouvez savoir sur quelle branche vous vous trouvez.

Avec la commande git checkout -b test, vous pouvez créer et déplacer la branche de test.
_L'option -b est utilisée pour dire à **checkout** que nous créons et déplaçons vers une branche_

Pour passer d'une branche à une autre il suffit d'utiliser la commande git checkout branchName
REMARQUE : Lorsque vous créez des fichiers dans une branche (telle qu'une branche de test), la branche principale ne les verra pas.

Si vous souhaitez suivre le développement de la branche master, entrez la commande :
`git log --graph --oneline --all --decorate --topo-order`


## Fusionner deux branches
Si vous souhaitez fusionner deux branches, telles que main et test, accédez d'abord à la branche principale, puis saisissez la commande :
`git merge test`

Vous pouvez maintenant afficher tous les fichiers principaux et de test avec la commande `ls`.*

-----------------------------------------------------------------------------------------------

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
