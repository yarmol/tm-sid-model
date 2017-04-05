/**
* Converged Network ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.g.iI8G.v_E.eK5.fY.h.h4RE.fW.w-content.html">Converged Network ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.converged_network_business_entity ;

/**
* The TopologicalLink_ represents a communication relationship between n 
* etwork entities and indicates that information is intended to flow bet 
* ween those network entities. The TopologicalLink_ always represents a  
* logical relationship. Similar to Link [5] of 3GPP and TopologicalLink  
* of SID/MTOSI [7] 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class TopologicalLink extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field layerProtocolNameList
* Each entry provides the name and potentially additional information su 

* ch as version number for (one of) the protocol(s)/layer(s) that the TL 

*  supports. Syntax and semantic to be specified. 

*/
protected String layerProtocolNameList ;




/**  
* Field aEndTpeRefList
* The value of this attribute shall be the Distinguished Name of the alp 

* habetically first instance in the Link subclass name to which this lin 

* k/relation is associated (i.e., pointing to the instance of <X> as des 

* cribed in the definition of Link IOC in the present document). </br>As 

*  an example, with Link_As_Slf, aEnd would contain the Distinguished Na 

* me of the AsFunction instance, and the zEnd would contain the Distingu 

* ished Name of SlfFunction instance.</br></br> A TL must have at least  

* one A end and at least two ends.</br></br>Note that this attribute is  

* likely to change. 

*/
protected TerminationPointEncapsulation aEndTpeRefList ;




/**  
* Field zEndTpeRefList
* The value of this attribute shall be the Distinguished Name of the alp 

* habetically first instance in the Link subclass name to which this lin 

* k/relation is associated (i.e., pointing to the instance of <X> as des 

* cribed in the definition of Link IOC in the present document). </br>As 

*  an example, with Link_As_Slf, aEnd would contain the Distinguished Na 

* me of the AsFunction instance, and the zEnd would contain the Distingu 

* ished Name of SlfFunction instance.</br></br>A TL must have at least t 

* wo ends. A TL may have no z ends.</br></br>Note that this attribute is 

*  likely to change. 

*/
protected List<TerminationPointEncapsulation> zEndTpeRefList ;




/**  
* Field asapRef
* This attribute indicates the assignment of an Alarm Severity Assignmen 

* t Profiles (ASAP) to the TL. 

*/
protected AlarmSeverityAssignmentProfile asapRef ;




/**  
* Field tlRoutingParameterPackage
* Pulls in the package of attributes of the TL that relate to routing. 

*/
protected RoutingParameters tlRoutingParameterPackage ;




/**  
* Field direction
* This attribute represents the directionality of the TL. 

*/
protected NetworkDirection direction ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field isAlarmReporting
* This attribute identifies whether alarm reporting for this TL is admin 

* istratively enabled or disabled. </br>True = alarm reporting is enable 

* d; False = alarm reporting is disabled. 

*/
protected Boolean isAlarmReporting ;


}