/**
* Managed Transmission ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3124017F-content.html">Managed Transmission ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.managed_transmission_business_entity ;

/**
* This is an abstract base class for describing different types of logic 
* al entities that are or help to form connections that transmit and/or  
* receive information. This represents a superclass to various ITU specs 
*  (e.g., G.805 and M.3100) as well as IETF concepts (such as those foun 
* d in various RFCs) so that it can unite ITU and IETF concepts. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ManagedTransmissionEntity extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field additionalInfo
* This is a free-form string that is used to contain additional vendor-s 

* pecific information about the managed element., such as a vendor-speci 

* fic asset tracking number or special installation notes. This can be N 

* ULL. 

*/
protected String additionalInfo ;




/**  
* Field mteAdministrativeState
* This attribute is based on X.721. It is an enumerated integer that def 

* ines the administrative state of the Equipment. Values include:</br></ 

* br> 0: Unknown</br> 1: Unlocked</br> 2: Locked</br> 3: Shutting Down</ 

* br> 4: Starting Up</br> 5: Testing</br> 6: Maintenance</br> 

*/
protected Integer mteAdministrativeState ;




/**  
* Field logicalAlarmReportingEnabled
* This is a Boolean attribute, and defines whether alarm reporting for t 

* his object instance is enabled or not. TRUE means that reporting is al 

* lowed, and FALSE means that reporting is inhibited. 

*/
protected Boolean logicalAlarmReportingEnabled ;




/**  
* Field logicalAlarmStatus
* This is an enumerated integer that indicates the occurrence of an abno 

* rmal condition relating to an object. This attribute may also function 

*  as a summary indicator of alarm conditions associated with a specific 

*  resource. It is used to indicate the existence of an alarm condition, 

*  a pending alarm condition such as threshold situations, or (when used 

*  as a summary indicator) the highest severity of active alarm conditio 

* ns. Values include:</br></br> 0: unknnown</br> 1: active -Critical</br 

* > 2: active - Major</br> 3: active - Minor</br> 4: active - Indetermin 

* ate</br> 5: active - Warning</br> 6: active - Pending</br> 7: active - 

*  UnderRepair</br> 8: active- Being Replaced</br> 9: cleared</br> 

*/
protected Integer logicalAlarmStatus ;




/**  
* Field isMTEOperational
* This attribute is used to define the operational status of the object, 

*  and is implemented as a Boolean: TRUE means that the object is curren 

* tly operational, and FALSE means that the object is not currently oper 

* ational. 

*/
protected Boolean isMTEOperational ;




/**  
* Field typeOfMTE
* This attribute is an enumerated integer. It defines the type of Manage 

* dTransmissionEntity that this instance is. Values include:</br></br> 0 

* : Unknown</br> 1: Connection</br> 2: Trail</br> 3: TrailTerminationPoi 

* ntSource</br> 4: TrailTerminationPointSink</br> 5: TrailTerminationPoi 

* ntBiDirectional</br> 6: ConnectionTerminationPointSource</br> 7: Conne 

* ctionTerminationPointSink</br> 8: ConnectionTerminationPointBiDirectio 

* nal</br> 

*/
protected Integer typeOfMTE ;




/**  
* Field operationalState
* This attribute is based on X.721, and defines the current operationalS 

* tate of its containing managed object. Values include:</br></br> 0: St 

* atus not available</br> 1: Enabled and In Service</br> 2: Enabled but  

* Not In Service</br> 3: Disabled</br> 

*/
protected Integer operationalState ;


}