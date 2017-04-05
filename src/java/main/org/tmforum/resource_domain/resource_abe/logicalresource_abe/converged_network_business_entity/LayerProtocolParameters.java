/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* Package of attributes that relate to a specified layerProtocol of an N 
* FD. 
 @since SID_R16.5
*/ 

public  class LayerProtocolParameters  {



/**  
* Field layerProtocolName
* Provides the name and potentially additional information such as versi 

* on number for the protocol/layer of thr NFD to which the transmission  

* parameters in the package belong. 

*/
protected String layerProtocolName ;




/**  
* Field transmissionParameterList
* A list of specific parameters related to the layerProtiocol specified  

* in the package that apply of the NFD.  

*/
protected List<AttributeValuePair> transmissionParameterList ;


}