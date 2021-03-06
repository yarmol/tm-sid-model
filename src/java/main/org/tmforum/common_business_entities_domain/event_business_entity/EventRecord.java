/**
* Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6.cTK.wOQ3E.eSLUP.cWF.t3.jV.w-content.html">Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.event_business_entity ;

/**
* null 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::ManagedEntity @since SID_R16.5
*/ 

public abstract class EventRecord extends ManagedEntity {



/**  
* Field eventRecordComposite
*/
protected EventRecordComposite eventRecordComposite ;




/**  
* Field eventPayload
*/
protected List<EventPayload> eventPayload ;




/**  
* Field eventOccurence
*/
protected List<EventOccurence> eventOccurence ;


}