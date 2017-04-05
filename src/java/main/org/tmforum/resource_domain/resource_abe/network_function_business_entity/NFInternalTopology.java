/**
* Network Function ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.dQPT.gHPZE.eSII8.f.s.sZ.y.cKQ-content.html">Network Function ABE</a> 
* The Network Function ABE contains entities that are used to represent  
* Network Function as a Functional Block (FB) within a network infrastru 
* cture which has well-defined external interfaces and well-defined func 
* tional behavior. Network Functions can be physical (PNF) or virtual (V 
* NF). 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.network_function_business_entity ;

/**
* An Adjacency Graph expressing the adjacency requirements between the i 
* nternal connection points of the VNF Components. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Topology ABE::AdjacencyGraph |- 
 SID Models::Common Business Entities Domain::Topology ABE::Graph @since SID_R16.5
*/ 

public  class NFInternalTopology extends AdjacencyGraph,Graph {



/**  
* Field networkfunction
*/
protected NetworkFunction networkfunction ;


}