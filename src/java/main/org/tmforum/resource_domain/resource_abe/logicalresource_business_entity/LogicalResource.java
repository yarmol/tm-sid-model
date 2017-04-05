/**
* LogicalResource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA0990115-content.html">LogicalResource ABE</a> 
* The Resource ABE contains entities that are used to represent the vari 
* ous aspects of a Resource.LogicalResource entities are sets of entitie 
* s that represent the logical aspects of a Resource. This is important  
* to enable the SID to build a set of reusable managed entities that can 
*  be used to model the logical aspects of different types of Resources. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_business_entity ;

/**
* This is an abstract base class for describing different logical aspect 
* s of devices (e.g., DeviceInterfaces) that constitute a Product. It ha 
* s two main purposes: (1) to collect common attributes and relationship 
* s for all logical entities, and (2) to provide a convenient, single po 
* int where relationships with other managed objects can be defined. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class LogicalResource extends Resource,Entity,RootEntity {



/**  
* Field lrStatus
* This is an enumerated integer whose value indicates the current status 

*  of the object. The following values are defined:</br></br> 0: Unknown 

* </br> 1: OK</br> 2: Initializing</br> 3: Starting</br> 4: Paused</br>  

* 5: Stopping</br> 6: Stopped</br> 7: Degraded</br> 8: Stressed </br> 9: 

*  Predicted Failure</br> 10: Error - General</br> 11: Error - Non Recov 

* erable</br> 12: Not Installed or Not Present</br> 13: In Maintenance</ 

* br> 14: Unable To Contact</br> 15: Lost Communications</br></br>Stoppe 

* d indicates that the LogicalResource is known to still exist, but it i 

* s no longer operational. However, it has not failed.</br> </br>Stresse 

* d indicates that the LogicalResource is functioning, but needs attenti 

* on (e.g., it may be overheating, or overloaded in some way). This is s 

* imilar to Predicted Failure, which indicates that this LogicalResource 

*  is functioning properly, but is predicting a failure in the near futu 

* re.</br></br>In Maintenance indicates that this LogicalResource is bei 

* ng configured, maintained, or otherwise administered and is NOT availa 

* ble for service.</br></br>Unable To Contact indicates that the monitor 

* ing system has knowledge of this LogicalResource but has never been ab 

* le to establish communications with it. In contrast, Lost Commmunicati 

* ons indicates that the LogicalResource has been contacted successfully 

*  in the past and is known to still exist; however, it is currently unr 

* eachable.</br></br>This is an optional attribute.</br> 

*/
protected Integer lrStatus ;




/**  
* Field serviceState
* This is an enumerated integer that defines the availability and usage  

* (i.e., the service state) of this LogicalResource. Its values are:</br 

* ></br> 0: Unknown</br> 1: In Service</br> 2: Out of Service</br> 3: Te 

* sting</br> 4: In Maintenance</br> 5: Not Available</br> 6: Not Applica 

* ble</br></br>This is an optional attribute.</br> 

*/
protected Integer serviceState ;




/**  
* Field isOperational
* This attribute is used to define the operational status of the object, 

*  and is implemented as a Boolean: TRUE means that the object is curren 

* tly operational, and FALSE means that the object is not currently oper 

* ational.</br></br>This is a REQUIRED attribute.</br> 

*/
protected Boolean isOperational ;




/**  
* Field physicalResource
*/
protected List<PhysicalResource> physicalResource ;




/**  
* Field logicalResourceRole
*/
protected List<LogicalResourceRole> logicalResourceRole ;




/**  
* Field resourceFacingService3
*/
protected List<ResourceFacingService> resourceFacingService3 ;




/**  
* Field network
*/
protected Network network ;




/**  
* Field networkFunction
*/
protected List<NetworkFunction> networkFunction ;




/**  
* Field virtualResource
*/
protected List<VirtualResource> virtualResource ;


}