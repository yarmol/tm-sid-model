/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* An entry in a calendar. This is an abstract entity. 
 @since SID_R16.5
*/ 

public abstract class CalendarEntry  {



/**  
* Field id
* Unique identifier</br>Note:</br>UID [iCalendar] 

*/
protected String id ;




/**  
* Field description
* A complete description of the entry:</br></br>Notes:</br>DESCRIPTION [ 

* iCalendar] 

*/
protected String description ;




/**  
* Field summary
* A summarized description or subject of the entry 

*/
protected String summary ;




/**  
* Field versionNr
* A sequence number, showing the version of the entry. It is incremented 

*  whenever the entry is modified and saved.</br>Note:</br>SEQUENCE [iCa 

* lendar]</br></br>Permitted Values:</br>>0 

*/
protected String versionNr ;




/**  
* Field comment
* Comment text about the entry</br>Note:</br>COMMENT [iCalendar] 

*/
protected String comment ;




/**  
* Field status
* The status of the Event, toDo or Journal entry</br>Note:</br>STATUS [i 

* Calendar]</br>Permitted Value:</br>refer [iCalendar]</br></br> 

*/
protected String status ;




/**  
* Field accessClassification
* the access intended for this entry</br></br>Permitted Values:</br>PUBL 

* IC, PRIVATE or CONFIDENTIAL</br></br></br> 

*/
protected String accessClassification ;




/**  
* Field isRVSPRequested
* If an RSVP is expected</br>Notes:</br>RVSP [iCalendar]</br></br>Permit 

* ted Values:</br>True, False</br></br> 

*/
protected Boolean isRVSPRequested ;




/**  
* Field creationDate
* The DateTime (in UTC time) that the entry was created</br>note:</br>CR 

* EATED [iCalendar] 

*/
protected Object creationDate ;




/**  
* Field lastModifiedDate
* The DateTime (in UTC time) that the entry was lastModifier</br>Note:</ 

* br>LAST-MODIFIED [iCalendar] 

*/
protected Object lastModifiedDate ;




/**  
* Field calendarEntryCategory
*/
protected List<CalendarEntryCategory> calendarEntryCategory ;




/**  
* Field calendarEntryAttachment
*/
protected List<CalendarEntryAttachment> calendarEntryAttachment ;




/**  
* Field organizer
*/
protected CalendarEntryOrganizer organizer ;




/**  
* Field sender
*/
protected CalendarEntryOrganizer sender ;




/**  
* Field calendarEntry
*/
protected CalendarEntry calendarEntry ;




/**  
* Field calendarEntry1
*/
protected List<CalendarEntry> calendarEntry1 ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field calendar
*/
protected Calendar calendar ;




/**  
* Field calendarPartyRole
*/
protected List<CalendarPartyRole> calendarPartyRole ;




/**  
* Field recurrenceTemporalExpression
*/
protected RecurrenceTemporalExpression recurrenceTemporalExpression ;




/**  
* Field simpleTemporalExpression
*/
protected SimpleTemporalExpression simpleTemporalExpression ;




/**  
* Field temporalExpression
*/
protected TemporalExpression temporalExpression ;




/**  
* Field language
*/
protected Language language ;




/**  
* Field event
*/
protected Event event ;




/**  
* Field appointment
*/
protected List<Appointment> appointment ;




/**  
* Field workforceEmployeeReservation
*/
protected List<WorkforceEmployeeReservation> workforceEmployeeReservation ;




/**  
* Field workforceEmployeeAssignment
*/
protected List<WorkforceEmployeeAssignment> workforceEmployeeAssignment ;




/**  
* Field workforceResourceAssignment
*/
protected List<WorkforceResourceAssignment> workforceResourceAssignment ;




/**  
* Field workforceResourceReservation
*/
protected List<WorkforceResourceReservation> workforceResourceReservation ;


}