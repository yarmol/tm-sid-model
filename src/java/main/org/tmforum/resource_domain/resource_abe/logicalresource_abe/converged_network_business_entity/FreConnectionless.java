/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Package of attributes that relate to preservation of information flow  
* identifiers and other flow control properties across the FRE. 
 @since SID_R16.5
*/ 

public  class FreConnectionless  {



/**  
* Field flowIdentifier
* This parameter contains the internal identifier of the flow through TP 

* Es and decomposed FREs.</br>An example of a flow identifier is the IVI 

* D which defines the value to be used for VID in S-TAGs pushed onto the 

*  frames at entry to the FD.</br>When the value of flowIdentifier on an 

*  FRE is not “null", the value of the  corresponding flowIdentifier for 

*  all of the TPEs attached to this FRE and to any supporting FREs have  

* the same value as the as the flowIdentifier on the FRE.</br>If the FRE 

*  is performing flowIdentifier swapping inside (as opposed to only at t 

* he edges), the flowIdentifier on the FRE is not meaningful (and set to 

*  “null”).</br>Note:</br>Since the flowIdentifier a TPE of the FRE has  

* the same value as the flowIdentifer of the FRE (when the flowIdentifie 

* r of the FRE is not “null”) any attempt to set a different value for t 

* he flowIdentifier of the TPE will be rejected. 

*/
protected String flowIdentifier ;




/**  
* Field isEdgeFlowIdentifierPreserved
* If True, the relevant flow identifier of particular information egress 

* ing the FRE at the boundary of the FRE is the same as the flowIdentifi 

* er used for that particular traffic at the ingress to the FRE. If flow 

* Identifier stacking or translation is applied within the FRE, the stac 

* king/translation tables on all endpoints of the FRE will be set such t 

* hat the above condition is satisfied for any flow. 

*/
protected Boolean isEdgeFlowIdentifierPreserved ;




/**  
* Field isEdgePriorityPreserved
* This attribute shall indicate whether the egress Priority in the frame 

*  header must be the same as the ingress Priority 

*/
protected Boolean isEdgePriorityPreserved ;


}