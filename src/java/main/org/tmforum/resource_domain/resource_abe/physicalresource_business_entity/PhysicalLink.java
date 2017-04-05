/**
* PhysicalResource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA0E303D6-content.html">PhysicalResource ABE</a> 
* The Resource ABE contains entities that are used to represent the vari 
* ous aspects of a Resource.PhysicalResource entities are sets of entiti 
* es that represent the physical aspects of a Resource. This is importan 
* t to enable the SID to build a set of reusable managed entities that c 
* an be used to model the physical aspects of different types of Resourc 
* es. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_business_entity ;

/**
* This is a concrete class that represents the connecting or cabling tog 
* ether of hardware entities. This enables both wireless and connector-b 
* ased communication to be modeled. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource" href="_3E3F0EC000E93CDAA53A023C-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource</a> |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalLink extends PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field isWireless
* This is a Boolean attribute that defines whether this link is a wirele 

* ss connection or not. TRUE means that this is a wireless connection, a 

* nd FALSE means that the connection uses one or more cables and connect 

* ors to communicate. This is a REQUIRED attribute. 

*/
protected Boolean isWireless ;




/**  
* Field currentLength
* This is a string attribute that defines the current length of the Phys 

* icalLink in feet. For some connections, such as wireless connections,  

* this property may not be applicable and should be assigned the special 

*  value of NULL. This is an optional attribute. 

*/
protected String currentLength ;




/**  
* Field maximumLength
* This is a string attribute that defines the maximum allowable length o 

* f the PhysicalLink in feet. For some connections, such as wireless con 

* nections, this property may not be applicable and should be assigned t 

* he special value of NULL. This is an optional attribute. 

*/
protected String maximumLength ;




/**  
* Field mediaType
* This is an enumerated integer, and is used to define the particular ty 

* pe of media that is used to carry communication. Values include:</br>< 

* /br> 0: Unknown</br> 1: Wireless</br> 2: Cat1</br> 3: Cat2</br> 4: Cat 

* 3</br> 5: Cat4</br> 6: Cat5</br> 7: 50-ohm Coaxial</br> 8: 75-ohm Coax 

* ial</br> 9: 100-ohm Coaxial</br> 10: Fiber-optic</br> 11: UTP</br> 12: 

*  STP</br> 13: Ribbon Cable</br> 14: Twinaxial</br> 15: Optical 9um</br 

* > 16: Optical 50um</br> 17: Optical 62.5um</br></br>This is a REQUIRED 

*  attribute.</br> 

*/
protected Integer mediaType ;




/**  
* Field physicalConnector
*/
protected List<PhysicalConnector> physicalConnector ;




/**  
* Field hardware
*/
protected List<Hardware> hardware ;


}