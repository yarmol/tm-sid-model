/**
* Hardware ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3EF2015D-content.html">Hardware ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.hardware_business_entity ;

/**
* This is a concrete class that represents any type of hardware unit tha 
* t is used to connect to other hardware units and transmit signals and/ 
* or power between them. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware" href="_3E3F0EC000E93CDAB5F60264-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalConnector extends Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field physicalLink
*/
protected PhysicalLink physicalLink ;




/**  
* Field cableType
* This is an enumerated integer, and defines the particular type of cabl 

* e that is attached to this connector. Values include:</br></br> 0: Unk 

* nown</br> 1: RS-232</br> 2: RS-422</br> 3: RS-423</br> 4: RS-449</br>  

* 5: RS-485</br> 6: RS-530</br> 7: V.35</br> 8: X.21</br> 9: 9 um single 

* -mode</br> 10: 62.5/125 um multi-mode</br> 11: USB</br></br>to be cont 

* inued, not done!</br></br>This is a REQUIRED attribute.</br> 

*/
protected Integer cableType ;




/**  
* Field gender
* This is an enumerated integer that defines the gender type of the conn 

* ector. Values are:</br></br> 0: Unknown</br> 1: Not Applicable</br> 2: 

*  Male</br> 3: Female</br></br>This is a REQUIRED attribute.</br> 

*/
protected Integer gender ;




/**  
* Field inUse
* This is a boolean attribute that, if TRUE, indicates that this Physica 

* lConnector is in use by some other component of the system. This is an 

*  optional attribute. 

*/
protected Boolean inUse ;




/**  
* Field pinDescription
* This is a free-form string describing the pin configuration and signal 

*  usage of a PhysicalConnector.</br></br>This is a REQUIRED attribute.< 

* /br> 

*/
protected String pinDescription ;




/**  
* Field typeOfConnector
* This is an enumerated integer that defines the type of connector that  

* this instance is. Values include:</br></br> 0: Unknown</br> 1: DB-9</b 

* r> 2: DB-15</br> 3: DB-25</br> 4: DB-36</br> 5: DB-60</br> 6: SC</br>  

* 7: SG</br></br>to be continued, not done!</br></br>This is a REQUIRED  

* attribute.</br></br> 

*/
protected Integer typeOfConnector ;




/**  
* Field physicalConnector
*/
protected List<PhysicalConnector> physicalConnector ;




/**  
* Field physicalConnector1
*/
protected List<PhysicalConnector> physicalConnector1 ;




/**  
* Field hardware
*/
protected Hardware hardware ;




/**  
* Field physicalPort
*/
protected List<PhysicalPort> physicalPort ;


}