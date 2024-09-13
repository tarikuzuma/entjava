# Chancellor Galiza Project 🚀

This Spring Boot Application contains five end points :

    /validate/email
    /validate/postcode
    /parse/name
    /museum
    /museum/{id}

### How to use the end points

#### /validate/email

    /validate/email?email=<username@domain.com>
        
        This end point validates if the supplied value for email address is valid.
        This will aid in validating if form inputs are erroneous.
        Better be careful, please supply the correct email addresses next time.
        One might get lucky with Amazon gift cards
        
    sample output : 
    
    /validate/email?email=chancellor.galiza@upd.edu.ph

    reponse : true
    
#### /validate/postcode

    /validate/postcode?postcode=EC2Y9DT
        
        This end point validates if the supplied value for postcode is valid.
        Returns the region if valid. Use case, you may want to purchase properties
        in the UK, this will prevent you from being fooled. 
        You may end up in North Korea.
        
    sample output : 
    
    /validate/postcode?postcode=EC2Y9DT

    reponse : London
    
    http://localhost:8090/validate/postcode?postcode=EC2Y9DTXXX
    
    response : Invalid Postal Code
    
    
#### /parse/name
    
    /parse/name?name=Chancellor Galiza
        
        This end point will parse the firstname and lastname from the supplied String.
        This will be helpfull if you forgot your name. Chancellor is my name, it is
        considered as a high ranking official in Germany and Universities
        
    sample output : 
    
    /parse/name?name=Chancellor Galiza

    reponse : 
    
    {
        "firstName": "Chancellor",
        "lastName": "Galiza"
    }
    
    /parse/name?name=Dr. Chancellor
    
    response :
    {
        "name": "Dr. Chancellor",
        "error": "supplied name can't be parsed"
    }
    
    Note: unless you name is Dr. the output is wrong. please send me an email to
    chancellor.galiza@upd.edu.ph, I will make amends.
    

#### /museum

    /museum
        
        This end point requires a request body, which contains keywords for searching.
        In case you don't know what you are searching for, this is a great help.
        The inventor of the endpoint does made the searching case sensitive.
        The author wishes you find what you are searching for.
        
    sample output : 
    
    /museum

    request body :

    {
        "keywords": [
            "photography",
                "industry",
                "retailing",
                "sales",
                "newsletters"
        ]    
    }

    reponse : 
    [
        {
            "id": "media/1168319",
            "caption": "Folder - Kodak Australasia Pty Ltd, Sales & Dealer News, 1968-1978"
        },
        {
            "id": "media/1168320",
            "caption": "Folder - Kodak Australasia Pty Ltd, Sales & Dealer News, 1968-1978"
        }
    ]
    
    Note : the above response is only a subset of the complete result-set, would not
    want your eyes to strain with the lengthy lovely data mangled.
    
    /museum/{id}
    
        Now this is the real deal. You only use this if you know what you need.
        Notice the above endpoint, has responses of this format "media/media/1168320".
        It is a good thing you already know what to search. Please see sample below on
        how to do it.
        
    /museum/media/1168320

    response :
    
    {
        "type": "image",
        "id": "media/1168320",
        "dateModified": "2020-08-04T05:35:00Z",
        "caption": "Folder - Kodak Australasia Pty Ltd, Sales & Dealer News, 1968-1978",
        "creators": [],
        "sources": [
            "Museums Victoria"
        ],
        "credit": "Courtesy of Kodak (Australasia) Pty Ltd",
        "rightsStatement": "Copyright Kodak (Australasia) Pty Ltd / All Rights Reserved",
        "licence": {
            "name": "All Rights Reserved",
            "shortName": "All Rights Reserved",
            "uri": ""
        }
    }
    
#### Thanks

    Hope you all enjoy the codes as much I enjoy writing them
    
                                        - Chancellor Galiza
    
## The used key  is always bright.
