/**
* Physical Capacity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA39A0276-content.html">Physical Capacity ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_capacity_business_entity ;

/**
* This is an abstract class that represents the minimum and maximum requ 
* irements, limits, or other variable features of a ManagedDevice or Man 
* agedHardware object. 
 @since SID_R16.5
*/ 

public abstract class PhysicalCapacity  {



/**  
* Field physicalCapacityStatus
* This is an enumerated integer whose value indicates the current status 

*  of this category of capacity object. The category is the name of the  

* subclass. For example, the PhysicalMemoryCapacity subclass inherits th 

* e Status attribute, so the status applies to this instance of Physical 

* Memory. The following values are defined:</br></br> 0: Unknown</br> 1: 

*  OK</br> 2: Initializing</br> 3: Starting</br> 4: Paused</br> 5: Stopp 

* ing</br> 6: Stopped</br> 7: Degraded</br> 8: Stressed</br> 9: Critical 

* </br> 10: Predicted Failure</br> 11: Error - General</br> 12: Error -  

* Non Recoverable</br> 13: Not Installed or Not Present</br> 14: In Main 

* tenance</br> 15: Unable To Contact</br> 16: Lost Communications</br></ 

* br>Stopped indicates that the object is known still exist, but it is n 

* o longer operational. However, it has not failed. Stressed indicates t 

* hat the object is functioning, but needs attention (e.g., it may be ov 

* erheating, or overloaded in some way). Predicted Failure indicates tha 

* t this object is functioning properly but predicting a failure in the  

* near future.</br></br>In Maintenance describes an object that is being 

*  configured, maintained, or otherwise administered and is NOT availabl 

* e for service. Unable To Contact indicates that the monitoring system  

* has knowledge of this object but has never been able to establish comm 

* unications with it. Lost Commmunications indicates that the object has 

*  been contacted successfully in the past and is known to still exist;  

* however, it is currently unreachable.</br></br>This is an optional att 

* ribute.</br> 

*/
protected Integer physicalCapacityStatus ;




/**  
* Field physicalContainer
*/
protected PhysicalContainer physicalContainer ;


}