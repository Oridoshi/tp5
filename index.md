***Nom    :** Dunet Tom
**Groupe :** A1
**Année  :** 2023
**IUT Le Havre - Cours GIT**

# Compte-rendu TP Introduction GIT
Dans ce premier TP, on apprend à travailler avec GIT.



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