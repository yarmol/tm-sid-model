/**
* Topology ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.yXJ.r.oONSE.eSK.n.e.r.d.a0C.s.qA-content.html">Topology ABE</a> 
* The Topology ABE contains entities that are used to represent topologi 
* cal concepts that can be used to model a large variety of topological  
* relations between entities ranging from dependencies to connectivity. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.topology_business_entity ;

/**
* A Graph expressing an adjacency requirement or property, independently 
*  from how this is realized. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Topology ABE::Graph" href="_.b.n2XQONUE.eSK.n.e.r.d.a0C.s.qA-content.html">SID Models::Common Business Entities Domain::Topology ABE::Graph</a> @since SID_R16.5
*/ 

public abstract class AdjacencyGraph extends Graph {



/**  
* Field connectivityGraph
*/
protected ConnectivityGraph connectivityGraph ;


}