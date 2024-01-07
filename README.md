# Design_Pattern


Design pattern factory qui fait partie de la famille de création des objets , il est largement utilisé par le JDK 
il est utilisé pour déléger la partie de création aux sous classes
la différence entre abstractFactory et factory c'est au niveau de l'abstraction : 
asbtract factory c'est pour créer des objets interdépendants et liés entre eux.
factory c'est de laisser la partie de création aux sous classes
------------------------------------------------------------------------------------------------------------------------------------
Singleton garantie qu'une seule instance est stocké dans la JVM pour des besoin de performance
pour garantir l'utilisation du singleton :
1 : Utiliser un constructeur privé pour bloquer l'instanciation de la classe via une autre classe sans faire un test s'il y'a une
instance déjà créé de la classe ou pas
2 : une variable statique de meme type de la classe qui est la seule instance de la classe
3 une méthode statique public synchronisé pour retourner l'instance de la classe

on a 3 type de singleton pattern :
1 : lazyinitialization : on fait un test si l'instance est null sinon on instanci la classe et retourner l'instance
2 : StaticBlockInitialization : on garantie l'instanciation de la classe une seule fois au moment du chargement de la classe 
grace au bloc static 
3: EagerInitialization: on créé l'instance à l'avance dès que le chargement de la classe dans une variable privé static et finale
4: threadSafe : en utilisant le mot clé synchronized on s'assure qu'on ne trouve pas dans un instant t deux ou plusieurs ressources qui accèdent
à la méthode getInstance() , parce que sinon on rique d'avoir plusieurs instances , avec synchronized on s'assure que les threads s'éxécutent
l'un après l'autre



proxy pattern fait partie de la classification structurelle son but est d'ajouter une couche supplémentaire pour gérer l'accès à une ressource
depuis le reste du code selon des conditionts à mettre en place. le reste du code sera en contact qu'avec cette couche intérmidiaire afin
d'acceder à cette ressource et selon les conditions , cette couche va executer la ressource ou pas (exemple github)

Decorater pattern : appartient à la classification GOF structurelle ( la façon dont les classes sont connectés ( diagram de classe )
pour que ces classes seront indépendant des évolutions futures de l'application.
il a pour objectif de modifier les fonctionnalités des objets au moment de l'execution.
on peut décorer notre objet de plusieurs façon ( cafe au lait ou/et chocolat ou/et caramel) en utilisant une classe
abstraite Boisson pour les boissons et une classe abstraite Decorateur pour décorer les objets

---> on créer les objets (qu'est ce qu'on veut gérer réellement ) et après on ajoute une classe abstraite decorateur ( on donne
l'objet en paramétre dans le construteur ) et après on peut le décorer
---> couplage faible car on peut créer d'autre objets et d'autres décorateur sans avoir besoin de modifier le comportement des
objets : on passe par un contrat ( classe abstraite ici ) et non pas la vrai implémentation des décorations.