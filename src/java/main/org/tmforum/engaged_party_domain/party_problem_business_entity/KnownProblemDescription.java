/**
* Party Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.m.eEE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Problem ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_problem_business_entity ;

/**
* A description of a known problem, optionally with some known workaroun 
* ds. It may be shared by multiple PartyProblems. 
 @since SID_R16.5
*/ 

public  class KnownProblemDescription  {



/**  
* Field partyProblem
*/
protected List<PartyProblem> partyProblem ;




/**  
* Field partyProblemWorkaround
*/
protected List<PartyProblemWorkaround> partyProblemWorkaround ;




/**  
* Field name
* Short readable name for the known problem 

*/
protected String name ;




/**  
* Field description
* A text explaining the problem and its possible sources 

*/
protected String description ;


}