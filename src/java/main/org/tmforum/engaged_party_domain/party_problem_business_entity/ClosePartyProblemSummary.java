/**
* Party Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.m.eEE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Problem ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_problem_business_entity ;

/**
* Records the closure activity of a PartyProblem. There may be more than 
*  one ClosePartyProblemSummary per PartyProblem because PartyProblems c 
* an be reopened, or a temporary solution may be replaced by a permanent 
*  one. 
 @since SID_R16.5
*/ 

public  class ClosePartyProblemSummary  {



/**  
* Field partyProblem
*/
protected PartyProblem partyProblem ;




/**  
* Field closeDate
* The date in which the PartyProblem was closed 

*/
protected DateTime closeDate ;




/**  
* Field ID
* A unique identifier that enables different instances of a ClosePartyPr 

* oblemSummary to be distinguished from each other. 

*/
protected String ID ;




/**  
* Field summary
* A textual description of the solution applied to the PartyProblem 

*/
protected String summary ;


}