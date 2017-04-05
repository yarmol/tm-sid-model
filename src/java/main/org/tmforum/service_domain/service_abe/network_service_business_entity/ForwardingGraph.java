/**
* Network Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_DQ.a3UHP.gE.eSII8.f.s.sZ.y.cKQ-content.html">Network Service ABE</a> 
* The Network Service ABE contains entities that are used to represent t 
* he set of Network Functions required to support a particular Service. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_abe.network_service_business_entity ;

/**
* An Adjacency Graph expressing the adjacency requirements between the C 
* onnection points of the Network Functions composing a Network Service. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Topology ABE::AdjacencyGraph |- 
 SID Models::Common Business Entities Domain::Topology ABE::Graph @since SID_R16.5
*/ 

public  class ForwardingGraph extends AdjacencyGraph,Graph {



/**  
* Field networkservice
*/
protected NetworkService networkservice ;


}