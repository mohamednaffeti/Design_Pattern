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
