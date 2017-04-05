/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class represents a set of Termination Points or Group Term 
* ination Points that are grouped. Properties that are common for all th 
* e TPs/GTPs in the TPPool are identified in the multiple associated com 
* monTransmissionParameters. See R_TMF518_NRF_I_0014 and R_TMF518_NRF_I_ 
* 0015. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class TerminationPointPool extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field numberOfMembers
* This attribute identifies the total number of TPs or GTPs currently co 

* ntained in the TPPool. 

*/
protected Integer numberOfMembers ;




/**  
* Field numberOfIdleMembers
* This attribute identifies the number of currently contained idle TPs o 

* r GTPs in the TPPool. 

*/
protected Integer numberOfIdleMembers ;




/**  
* Field commonTransmissionParameterList
* This attribute contains the common layers and Transmission Parameters  

* associated with the TPs grouped by the associated TpPool (or contained 

*  by the GTPs that are grouped by the associated TPPool). </br>Refer to 

*  attached supporting document SD1-16_LayeredParameters for details of  

* the currently defined Transmission Parameters. 

*/
protected List<TransmissionParameterList> commonTransmissionParameterList ;




/**  
* Field descriptionOfUse
* This attribute contains a description of the specific use of the TPPoo 

* l. </br>The description of use of an ATM VP TPPool would be "VirtualUN 

* I", if all its VP CTPs are contained in the same real user network int 

* erface (UNI) (i.e., a tributary ATM NI CTP) that is partitioned into v 

* irtual UNIs (i.e., VP TPPools). 

*/
protected String descriptionOfUse ;




/**  
* Field groupTerminationPoint
*/
protected List<GroupTerminationPoint> groupTerminationPoint ;




/**  
* Field containedGtpMemberList
*/
protected List<GroupTerminationPoint> containedGtpMemberList ;




/**  
* Field containedTpMemberList
*/
protected List<TIPTerminationPoint> containedTpMemberList ;




/**  
* Field multiLayerSubNetwork
*/
protected MultiLayerSubNetwork multiLayerSubNetwork ;


}