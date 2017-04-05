/**
* Termination Point ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C314E00A4-content.html">Termination Point ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.managed_transmission_abe.termination_point_business_entity ;

/**
* This is an abstract class that terminates transport entities, such as  
* trails and connections. This object class is a basic object class from 
*  which subclasses, such as TrailTerminationPoint and ConnectionTermina 
* tionPoint, are derived.This object is taken from M.3100. The SID integ 
* rates it into the ManagedTransmissionEntity hierarchy so that it can i 
* nteract with IETF managed objects. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::ManagedTransmissionEntity |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class TerminationPoint extends ManagedTransmissionEntity,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field pipe
*/
protected Pipe pipe ;




/**  
* Field direction
* This is an enumerated integer, and defines whether this object instanc 

* e carries traffic uni-directionally or bi-directionally. Values includ 

* e:</br></br> 0: Unknown</br> 1: Sources Traffic</br> 2: Sinks Traffic< 

* /br> 3: Carries Traffic Bi-directionally</br> 

*/
protected Integer direction ;




/**  
* Field vendorTPName
* This is a string that contains the vendor-specific name of this Termin 

* ationPoint. This is different from the CommonName attribute, which rep 

* resents a system-wide naming structure for all ManagedObjects. For exa 

* mple, an Alcatel CTP might be identified as LG1-STS12CA-13 (line group 

*  1, STS-12,</br>concatenated, side A, time slot 13).</br> 

*/
protected String vendorTPName ;




/**  
* Field typeOfTP
* This is an enumerated integer that is used to define the type of this  

* particular TP. Values include:</br></br> 0: unknown</br> 1: uni-direct 

* ional, source</br> 2: uni-directional, sink</br> 3: bi-directional, so 

* urce</br> 4: bi-directional, sink</br></br> 

*/
protected Integer typeOfTP ;




/**  
* Field endPointLabel
* This is a string that contains specific identifier information about t 

* he data flow managed on each TerminationPoint, for example ATM VP and/ 

* or VC, stacked Ethernet VLAN identifiers and so on. 

*/
protected String endPointLabel ;




/**  
* Field deviceInterface
*/
protected List<DeviceInterface> deviceInterface ;




/**  
* Field logicalDevice
*/
protected LogicalDevice logicalDevice ;




/**  
* Field resourcePort
*/
protected ResourcePort resourcePort ;


}