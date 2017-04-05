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
* The significance of the revision, such as major or minor.Permitted Val 
* ues:Major, Minor 
 @since SID_R16.5
*/ 

public  class BusinessInteractionVersion  {



/**  
* Field businessInteractionRevisionType
* The significance of the revision, such as major or minor.</br>Permitte 

* d Values:</br>Major, Minor</br> 

*/
protected String businessInteractionRevisionType ;




/**  
* Field businessInteractionRevisionNumber
* A unique number that identifies the revision. 

*/
protected String businessInteractionRevisionNumber ;




/**  
* Field businessInteractionRevisionDate
* The date of the revision. 

*/
protected TimePeriod businessInteractionRevisionDate ;




/**  
* Field businessInteractionRevisionDescription
* Text that explains the revision, including why the revision was made. 

*/
protected String businessInteractionRevisionDescription ;




/**  
* Field businessInteraction
*/
protected BusinessInteraction businessInteraction ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;


}