/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class is a collection of attributes which are used to defi 
* ne multi-layered transmission parameters and additional info parameter 
* s on a resource; e.g., a TP. See R_TMF518_NRF_I_0042 and R_TMF518_NRF_ 
* I_0043. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class TransmissionDescriptor extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field transmissionParameterList
* This attribute contains the layered Transmission Parameters associated 

*  with the different layers that are encapsulated within the Transmissi 

* on Descriptor. </br>Refer to attached supporting document SD1-16_Layer 

* edParameters for details of the currently defined Transmission Paramet 

* ers...\..\Framework\SD\SD1-16_LayeredParameters.pdf 

*/
protected List<TransmissionParameterList> transmissionParameterList ;




/**  
* Field additionalObjectInfoList
* This attribute contains additional parameters which can be set and/or  

* retrieved on an object having this Transmission Descriptor (TMD) assig 

* ned as (egress or ingress) TMD. 

*/
protected List<AttributeValuePair> additionalObjectInfoList ;




/**  
* Field externalRepresentationReference
* This attribute provides a means to store at the target OS a reference  

* to the external representation of the Transmission Descriptor. 

*/
protected String externalRepresentationReference ;




/**  
* Field containingTmdRef
*/
protected TransmissionDescriptor containingTmdRef ;


}