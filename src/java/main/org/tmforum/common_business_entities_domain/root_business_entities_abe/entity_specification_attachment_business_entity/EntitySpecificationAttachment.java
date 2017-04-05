/**
* Entity Specification Attachment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_I.a.vHAK0.wE.e.a.zDMG.f.zT.b.l9.g-content.html">Entity Specification Attachment ABE</a> 
* A collection of entities that can be used to define related entity spe 
* cification attachments like image and documentation. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.entity_specification_attachment_business_entity ;

/**
* This is the class to represent an attachment like document, image or v 
* ideo to an entity specification. 
 @since SID_R16.5
*/ 

public  class EntitySpecificationAttachment  {



/**  
* Field attachmentLink
* A kind of unique resource identifier like a file path or url that poin 

* ts to location of the attachment. 

*/
protected URI attachmentLink ;




/**  
* Field name
* A word, term, or phrase by which the EntitySpecificationAttachment is  

* known and distinguished from others. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the EntitySpecificationAttach 

* ment represents. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the EntitySpecificationAttachment is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field type
* Type of the attachment like Image, Video, Doc 

*/
protected String type ;




/**  
* Field entitySpecification
*/
protected EntitySpecification entitySpecification ;


}