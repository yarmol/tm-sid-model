/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Extensible list of identifier of types of NetworkForwardingDomains (NF 
* D). 
 @since SID_R16.5
*/ 

public  enum NfdType  {



/**  
* Field CHAIN
* NFD that encompasses capability from a simple chain of NEs. 

*/
 CHAIN ,




/**  
* Field MESH
* NFD that encompasses capability from a mesh of NEs. 

*/
 MESH ,




/**  
* Field OPEN_PS_RING
* NFD that encompasses capability from a chain of NEs that form part of  

* a protection switched ring. 

*/
 OPEN_PS_RING ,




/**  
* Field OPEN_SHARED_PS_RING
* NFD that encompasses capability from a chain of NEs that form part of  

* a shared protection switched ring 

*/
 OPEN_SHARED_PS_RING ,




/**  
* Field PS_RING
* NFD that encompasses all relevant capability from a ring of NEs that o 

* perate in a protected fashion. 

*/
 PS_RING ,




/**  
* Field SHARED_PS_RING
* NFD that encompasses all relevant capability from a ring of NEs that o 

* perate in a shared protected fashion. 

*/
 SHARED_PS_RING ,




/**  
* Field SINGLETON
* NFD that has only a single NE. Note an NE may participate in more that 

*  one NFD. 

*/
 SINGLETON ,


}