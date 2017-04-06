/**
* Topology ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.yXJ.r.oONSE.eSK.n.e.r.d.a0C.s.qA-content.html">Topology ABE</a> 
* The Topology ABE contains entities that are used to represent topologi 
* cal concepts that can be used to model a large variety of topological  
* relations between entities ranging from dependencies to connectivity. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.topology_business_entity ;

import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.RootEntity;

/**
*  A node within a graph. 
 @since SID_R16.5
*/ 

public abstract class Vertex  {



/**  
* Field graph
*/
protected Graph graph ;




/**  
* Field graph2
*/
protected Graph graph2 ;




/**  
* Field directedEdge
*/
protected DirectedEdge directedEdge ;




/**  
* Field directedEdge2
*/
protected DirectedEdge directedEdge2 ;




/**  
* Field rootEntity
*/
protected RootEntity rootEntity ;


}