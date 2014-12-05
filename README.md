UsageEvolution
==============

The purpose of the ScaleDL Usage Evolution is to enable modelling of how the load and work of a system evolves over time. The tool is Eclipse based, and provides a simple tree-based editor. ScaleDL Usage Evolution provides a thin modelling layer that expresses how the evolution of a set of variables applies to a usage model expressed in the [Palladio tool](http://www.palladio-simulator.com). The actual modelling of the evolution of a single variable (e.g. arrival rates or population in load or average video size in work) is done using the [LIMBO Load Intensity Modeling Tool](http://descartes.tools/limbo). 

The tool is based on the Eclipse Modelling Framework (EMF) and is built on an Ecore meta-model. The tree-based editor is generated from the meta-model and an EMF genmodel using the EMF facilities.
