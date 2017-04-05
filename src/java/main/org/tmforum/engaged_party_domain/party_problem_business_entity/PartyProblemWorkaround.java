/**
* Party Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.m.eEE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Problem ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_problem_business_entity ;

/**
* A resolution (sometimes temporary) for a KnownProblemDescription.  
 @since SID_R16.5
*/ 

public  class PartyProblemWorkaround  {



/**  
* Field commonProblemDescription
*/
protected KnownProblemDescription commonProblemDescription ;




/**  
* Field partyProblem
*/
protected List<PartyProblem> partyProblem ;




/**  
* Field partyProblemAttachment
*/
protected List<Attachment> partyProblemAttachment ;




/**  
* Field name
* Short readable name for the workaround 

*/
protected String name ;




/**  
* Field description
* A text explaining the workaround for the known problem.  

*/
protected String description ;




/**  
* Field attachment
*/
protected List<Attachment> attachment ;


}