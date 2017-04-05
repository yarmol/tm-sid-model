/**
* Business Interaction ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C18FFFD032B-content.html">Business Interaction ABE</a> 
* The Business Interaction ABE represents an arrangement, contract, or c 
* ommunication between an enterprise and one or more other entities such 
*  as individuals and organizations (or parts of organizations).  Intera 
* ctions take on the form of requests, responses, and notifications. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.business_interaction_business_entity ;

/**
* A communication that informs about something that has or will happen.  
* A Notification is typically one-sided, in that no Response is expected 
* . A Notification can be created as the result of a Request; for exampl 
* e, a Trouble Report may result in Notifications being sent to affected 
*  Parties. A Notification is a type of Business Interaction. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction" href="_3E3F0EC000E93C19002102B4-content.html">SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction</a> @since SID_R16.5
*/ 

public abstract class Notification extends BusinessInteraction {

}