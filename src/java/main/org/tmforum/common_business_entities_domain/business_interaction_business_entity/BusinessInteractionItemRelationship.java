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
* The BusinessInteractionItemRelationship enables specifying any kind of 
*  relationships between BusinessInteractionItemRelationship such as con 
* tains, relies on... 
 @since SID_R16.5
*/ 

public  class BusinessInteractionItemRelationship  {



/**  
* Field type
* The type of relationship such as contains, relies on. 

*/
protected String type ;




/**  
* Field businessInteractionItem
*/
protected BusinessInteractionItem businessInteractionItem ;




/**  
* Field businessInteractionItem2
*/
protected BusinessInteractionItem businessInteractionItem2 ;


}