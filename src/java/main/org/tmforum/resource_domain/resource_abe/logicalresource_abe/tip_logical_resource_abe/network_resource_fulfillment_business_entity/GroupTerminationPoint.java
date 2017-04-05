/**
* Network Resource Fulfillment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4WF4J2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Fulfillment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.tip_logical_resource_abe.network_resource_fulfillment_business_entity ;

/**
* This object class represents simply a list of CTPs in the same Managed 
*  Element. GroupTerminationPoints (GTPs) can be cross connected. All CT 
* Ps in a GTP are either bidirectional or unidirectional. A GTP can serv 
* e as an end point as well as an interior point of an SNC. However, a G 
* TP is not a CTP. For further information refer to attached supporting  
* document SD1-3_BundledSNC. See R_TMF518_NRF_I_0012 and R_TMF518_NRF_I_ 
* 0013...\SD\SD1-3_BundledSNC.pdf 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class GroupTerminationPoint extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field connectionState
* This attribute indicates the connectionState of the associated CTPs. A 

* ll CTPs associated to a GTP shall have the same connectionState. </br> 

* See R_TMF518_NRF_I_0037. 

*/
protected TerminationPointConnectionState connectionState ;




/**  
* Field isReportingAlarms
* This attribute provides an indication of whether alarm reporting for t 

* his GTP is administratively activated or de-activated. </br>True = ala 

* rm reporting is activated; False = alarm reporting is de-activated. 

*/
protected Boolean isReportingAlarms ;




/**  
* Field tpRefList
*/
protected List<TIPConnectionTerminationPoint> tpRefList ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field asapRef
*/
protected AlarmSeverityAssignmentProfile asapRef ;




/**  
* Field tpPoolRef
* This attribute identifies the name of the Termination Point Pool (TP P 

* ool) of which this GTP is a member. 

*/
protected TerminationPointPool tpPoolRef ;




/**  
* Field terminationPoint Pool
*/
protected TerminationPointPool terminationPoint Pool ;


}