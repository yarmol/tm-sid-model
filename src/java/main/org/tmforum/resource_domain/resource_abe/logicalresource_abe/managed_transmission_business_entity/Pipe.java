/**
* Managed Transmission ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3124017F-content.html">Managed Transmission ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.managed_transmission_business_entity ;

/**
* The Pipe object class is a class of managed objects which ensures the  
* transfer of information between two TerminationPoints. This is derived 
*  from the m.3100 specification.The Pipe object class is not instantiab 
* le because the transfer is effected via the client-server relationship 
*  of trail and connection. Connectivity direction is determined by the  
* directionality of the a and z termination points.If an instance of thi 
* s class is bidirectional, the a- and z-termination points shall also b 
* e bidirectional. If an instance of this class is unidirectional, the a 
* -point shall be the source TP and the z-termination point shall be the 
*  sink TP.This object is taken from M.3100. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::ManagedTransmissionEntity" href="_3E3F0EC000E93CDDC021028F-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::ManagedTransmissionEntity</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Pipe extends ManagedTransmissionEntity,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field isUniDirectional
* This is a Boolean attribute that, if TRUE, defines this Pipe to be Uni 

* Directional. If FALSE, it is by definition BiDirectional. 

*/
protected Boolean isUniDirectional ;




/**  
* Field operatingLayerRate
* This is a string attribute that defines the current operating layer ra 

* te of this Trail or Connection. 

*/
protected String operatingLayerRate ;




/**  
* Field terminationPoint
*/
protected TerminationPoint terminationPoint ;




/**  
* Field subNetwork
*/
protected SubNetwork subNetwork ;




/**  
* Field logicalDevice
*/
protected List<LogicalDevice> logicalDevice ;


}