/**
* Device Interface ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C94B202F2-content.html">Device Interface ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.device_interface_business_entity ;

/**
* This is an abstract class that serves as the superclass for all physic 
* al interfaces (physical in the sense that they are real interfaces tha 
* t can be instantiated - they are still logical entities) whose functio 
* nality is dependent on a particular transmission medium (e.g., Etherne 
* t vs. ATM). It serves as a convenient aggregation point for running di 
* fferent relationships that affect its subclasses, thereby avoiding hav 
* ing to instantiate multiple relationships that are essentially the sam 
* e. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface" href="_3E3F0EC000E93E0686B101A4-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class MediaInterface extends DeviceInterface,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field mtuSupported
* This is an integer attribute that defines the size of the maximum tran 

* smission unit (MTU) that can be supported by this interface. 

*/
protected Integer mtuSupported ;




/**  
* Field mtuCurrent
* This is an integer attribute that defines the size of hte maximum tran 

* smission unit (MTU) that is currently set for this particular interfac 

* e. 

*/
protected Integer mtuCurrent ;




/**  
* Field supportsMLPPP
* This is a Boolean attribute that, if TRUE, signifies this Media Interf 

* ace of being able to support MLPPP as defined in RFC 1990. 

*/
protected Boolean supportsMLPPP ;




/**  
* Field logicalInterface
*/
protected List<LogicalInterface> logicalInterface ;




/**  
* Field mediaInterface
*/
protected List<MediaInterface> mediaInterface ;




/**  
* Field mediaInterface1
*/
protected MediaInterface mediaInterface1 ;


}