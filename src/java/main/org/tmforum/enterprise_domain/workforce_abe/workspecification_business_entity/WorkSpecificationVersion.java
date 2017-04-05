/**
* WorkSpecification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_I1020N.mZE.eC.z9.a.o.eR.f.u.g.hA-content.html">WorkSpecification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workspecification_business_entity ;

/**
* A particular form or variety of a WorkSpecification that is different  
* from others or from the original. The form represents differences in p 
* roperties that characterize a WorkSpecification that are not enough to 
*  justify the creation of a new WorkSpecification. 
 @since SID_R16.5
*/ 

public  class WorkSpecificationVersion  {



/**  
* Field workSpecification
*/
protected WorkSpecification workSpecification ;




/**  
* Field workSpecRevisionType
* The significance of the revision. </br></br>Permitted Values: Major, M 

* inor 

*/
protected String workSpecRevisionType ;




/**  
* Field workSpecRevisionNumber
* A number that represents the occurrence of the version in the sequence 

*  of versions. 

*/
protected String workSpecRevisionNumber ;




/**  
* Field workSpecRevisionDate
* The date the version was created. 

*/
protected DateTime workSpecRevisionDate ;




/**  
* Field validFor
* The period during which the version is applicable. 

*/
protected TimePeriod validFor ;


}