/**
* Termination Point ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C314E00A4-content.html">Termination Point ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.managed_transmission_abe.termination_point_business_entity ;

/**
* This is an actual or potential end point of a Network connection. For  
* example, this can represent a logical channel or a timeslot on a physi 
* cal link.All PhysicalPorts connect to at least one type of CTP.This ob 
* ject is derived from MTNM (see TMF 608). The SID integrates it into th 
* e ManagedTransmissionEntity hierarchy so that it can interact with man 
* aged objects defined by the TMF, IETF, and other fora. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::Termination Point ABE::TerminationPoint" href="_3E3F0EC000E93CDDCABC021F-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::Termination Point ABE::TerminationPoint</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::ManagedTransmissionEntity |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ConnectionTerminationPoint extends TerminationPoint,ManagedTransmissionEntity,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field mappingMode
* This is an enumerated integer that defines the current mapping mode of 

*  this CTP. This defines how this CTP will support connections - at its 

*  maximum layer rate, at lower layer rates, or both. Values include:</b 

* r></br> 0: Unknown</br> 1: Neither terminated nor available for mappin 

* g</br> 2: Terminated but unavailable for mapping</br> 3: Mappable at l 

* ower rates</br> 4: Mappable at its maximum layer rate</br> 

*/
protected Integer mappingMode ;




/**  
* Field ctpState
* This is an enumerated integer that specifies the particular type of co 

* nnection that this CTP has. Values include:</br></br> 0: Unknown</br>  

* 1: Not applicable</br> 2: Source-Connected</br> 3: Sink-Connected</br> 

*  4: Bi-Directionally-Connected</br> 

*/
protected Integer ctpState ;




/**  
* Field supportedConnectionRates
* This attribute consists of a sequence of strings in the form of comma- 

* separated values. Each string defines a supported layer connection rat 

* e of the CTP. 

*/
protected String supportedConnectionRates ;




/**  
* Field connectionTerminationPoint
*/
protected List<ConnectionTerminationPoint> connectionTerminationPoint ;




/**  
* Field connectionTerminationPoint1
*/
protected ConnectionTerminationPoint connectionTerminationPoint1 ;




/**  
* Field securityThreatActor
*/
protected List<SecurityThreatActor> securityThreatActor ;


}