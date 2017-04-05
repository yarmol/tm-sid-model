/**
* Party Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.m.eEE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Problem ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_problem_business_entity ;

/**
* Represents a problem which affects the Party experience. PartyProblem  
* can be raised by the Party (a complaint) or by the CSP (typically thro 
* ugh some analytics system) 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class PartyProblem extends BusinessInteraction {



/**  
* Field partyProblemDescription
*/
protected KnownProblemDescription partyProblemDescription ;




/**  
* Field closePartyProblemSummary
*/
protected List<ClosePartyProblemSummary> closePartyProblemSummary ;




/**  
* Field partyProblemWorkaround
*/
protected PartyProblemWorkaround partyProblemWorkaround ;




/**  
* Field partyProblemTask
*/
protected List<PartyProblemTask> partyProblemTask ;




/**  
* Field severity
* The severity of the PartyProblem (in the eyes of the CSP). 

*/
protected String severity ;


}