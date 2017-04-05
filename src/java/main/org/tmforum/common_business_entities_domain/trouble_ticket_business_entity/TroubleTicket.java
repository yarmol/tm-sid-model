/**
* Trouble Ticket ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E942D47C04036D-content.html">Trouble Ticket ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.trouble_ticket_business_entity ;

/**
* A record used for reporting and managing the resolution of resource pr 
* oblems. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class TroubleTicket extends BusinessInteraction {



/**  
* Field troubleTicketState
* The current condition (state) of the TroubleTicket which is a composit 

* e of the ITU-X.790 Trouble Ticket state and status attributes. For exa 

* mple, open/active - testing. 

*/
protected String troubleTicketState ;




/**  
* Field troubleDetectionDate
* The date on which the trouble was discovered. 

*/
protected DateTime troubleDetectionDate ;




/**  
* Field serviceRestoredDate
* The date on which the service was brought back to its original conditi 

* on. 

*/
protected DateTime serviceRestoredDate ;




/**  
* Field troubleState
* The condition of the TroubleTicket as defined by the ITU-X.790 TRState 

*  attribute. (deprecated) 

*/
protected Integer troubleState ;




/**  
* Field troubleTicketItem
*/
protected List<TroubleTicketItem> troubleTicketItem ;




/**  
* Field securityIncident
*/
protected List<SecurityIncident> securityIncident ;


}