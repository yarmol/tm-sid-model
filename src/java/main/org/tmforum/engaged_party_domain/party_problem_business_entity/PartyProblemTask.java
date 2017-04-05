/**
* Party Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.m.eEE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Problem ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_problem_business_entity ;

/**
* a trackable task delegated from the PartyProblem with a specified due  
* date 
 @since SID_R16.5
*/ 

public  class PartyProblemTask  {



/**  
* Field partyProblem
*/
protected PartyProblem partyProblem ;




/**  
* Field creationDate
* The date and time in which the PartyProblemTask was created 

*/
protected DateTime creationDate ;




/**  
* Field dueDate
* The date and time in which the PartyProblemTask should be completed 

*/
protected DateTime dueDate ;




/**  
* Field status
* The current status of the task. Possible values (among others) are Wai 

* ting, In Process, Completed, Failed, Rejected  

*/
protected String status ;




/**  
* Field ID
* A unique identifier that enables different instances of a PartyProblem 

* Task to be distinguished from each other. 

*/
protected String ID ;


}