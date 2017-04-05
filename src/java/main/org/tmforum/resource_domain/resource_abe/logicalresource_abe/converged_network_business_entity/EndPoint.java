/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Represents the exposed points of the FRE to which associations to TPEs 
*  can be made. In a traditional model the points could be or role A and 
*  Z or Hub and Spoke. 
 @since SID_R16.5
*/ 

public  class EndPoint  {



/**  
* Field tpeIdType
* The type of the reference to the TPE (concrete name, SNPP id, TNA, Ser 

* vice end etc).  Indicates how to interpret _tpeIdRef. Effectively prov 

* ides the name of the namespace for _tpeIdRef to ensure uniqueness (in  

* cases where name space values may overlap). 

*/
protected TpeIdType tpeIdType ;




/**  
* Field tpeIdRef
* The ID of the TPE associated with the EndPoint. The EndPoint may have  

* no TPE associated during transitions associated with edits of Forwardi 

* ng or in any other case where the FRE can legally be partially interco 

* nnected. 

*/
protected TerminationPointEncapsulation tpeIdRef ;




/**  
* Field endPointDirection
* The direction of the EndPoint (ingress to the FRE, egress from the FRE 

*  or bidirectional). This enhances the FRE direction statement for comp 

* lex FREs. 

*/
protected EndpointDirection endPointDirection ;




/**  
* Field tpeAttachment
* Where in the LT of the TPE the FRE EndPoint is attached (CP, TCP etc). 

*/
protected TpeAttachmentType tpeAttachment ;




/**  
* Field endPointRoleList
* The list of role of the endpoint of the FRE in the context of the inte 

* rnals of the FRE structure. Each element of the list has a role name ( 

* e.g. TRAFFIC_FLOW) and a role value (A, Z, hub, spoke etc). The list m 

* ust have at least a TRAFFIC_FLOW entry. 

*/
protected List<EndPointRole> endPointRoleList ;




/**  
* Field endPointId
* Provides the ID of the EndPoint and can be used to identify role and r 

* ole group in simple cases where the FRE specification allows.</br>In s 

* ome cases it will be sufficient alone and will remove the need for the 

*  EndPointRole structure. 

*/
protected String endPointId ;


}