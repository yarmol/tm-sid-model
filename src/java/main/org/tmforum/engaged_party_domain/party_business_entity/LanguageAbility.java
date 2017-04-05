/**
* Party ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D812BC602C5-content.html">Party ABE</a> 
* A Party represents an individual or an organization, or an organizatio 
* n unit that are of interest, involved or that provide value directly o 
* r indirectly from an enterprise perspective (Enterprise is to be under 
* stood here as provider, service provider or operator). Hence the Party 
*  plays one or more roles with the enterprise or with another Party pla 
* ying a role with the enterprise (indirectly). This is introduced to sp 
* ecify that the only party an enterprise would be interested in and wil 
* l consider in its systems is a party playing a role (directly or indir 
* ectly). Roles would be represented by the PartyRole concept. Additiona 
* l roles will be defined to cover the needs of the new digital ecosyste 
* m."Examples of roles played by Parties include those:•&nbsp;&nbsp;&nbs 
* p;&nbsp;Of interest, such as competitors, sales prospects •&nbsp;&nbsp 
* ;&nbsp;&nbsp;Involved, such as customers, users, employees•&nbsp;&nbsp 
* ;&nbsp;&nbsp;That provides value directly or indirectly, such as servi 
* ce providers, operators, cloud brokers, infrastructure providers, appl 
* ication developers. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_business_entity ;

/**
* Represents the ability of a Party to understand or converse in a Langu 
* age 
 @since SID_R16.5
*/ 

public  class LanguageAbility  {



/**  
* Field writingProficiency
* Degree of mastery in writing a language. 

*/
protected String writingProficiency ;




/**  
* Field readingProficiency
* Degree of mastery in reading a language. 

*/
protected String readingProficiency ;




/**  
* Field speakingProficiency
* Degree of mastery in speaking a language. 

*/
protected String speakingProficiency ;




/**  
* Field listeningProficiency
* Degree of mastery in listening to a language. 

*/
protected String listeningProficiency ;




/**  
* Field language
*/
protected Language language ;




/**  
* Field party
*/
protected Individual party ;


}