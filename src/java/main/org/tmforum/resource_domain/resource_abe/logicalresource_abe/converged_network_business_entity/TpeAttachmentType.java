/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* The place in the LT of the TPE where the EndPoint is attached. 
 @since SID_R16.5
*/ 

public  enum TpeAttachmentType  {



/**  
* Field CP
* Represents the G.805 Connection Point. 

*/
 CP ,




/**  
* Field TCP
* Represents the G.805 Termination Connection Point. 

*/
 TCP ,




/**  
* Field UNSPECIFIED
* Can be used where there is only one possible attachment as defined by  

* the LT of the TPE. 

*/
 UNSPECIFIED ,


}