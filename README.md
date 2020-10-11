# API SPECS
## Create Student

Request :
- Method    : POST
- Endpoint  : 'api/students'
- Header    :
    - Content-Type : Application/json
    - Accept       : Application/json
- Body      : 

```json
{
  "id"     : "string, unique",
  "nisn"   : "string, unique",
  "name"   : "string",
  "gender" : "string",
  "major"  : "string",
  "spp"    : "long"
}
```

Response :

```json
{
  "code" : "number",
  "status": "string",
  "data" : {
      "id"     : "string, unique",
      "nisn"   : "string, unique",
      "name"   : "string",
      "gender" : "string",
      "major"  : "string",
      "spp"    : "long",
      "createdAt" : "date"
  }
}
```

## Get Student

Request :
- Method    : GET
- Endpoint  : 'api/students/{id_student}'
- Header    :
    - Accept       : Application/json

Response :

```json
{
  "code" : "number",
  "status": "string",
  "data" : {
      "id"     : "string, unique",
      "nisn"   : "string, unique",
      "name"   : "string",
      "gender" : "string",
      "class"  : "string",
      "major"  : "string",
      "spp"    : "long",
      "createdAt" : "date"
  }
}
```
## Update Student

Request :
- Method    : PUT
- Endpoint  : 'api/students/{nisn_student}'
- Header    :
    - Content-Type : Application/json
    - Accept       : Application/json
- Body      : 

```json
{
  "id"     : "string, unique",
  "name"   : "string",
  "gender" : "string",
  "class"  : "string",
  "major"  : "string",
  "spp"    : "long",
  "createdAt" : "date", 
  "updatedAt" : "date" 
}
```
Response :

```json
{
  "code" : "number",
  "status": "string",
  "data" : {
      "id"     : "string, unique",
      "nisn"   : "string, unique",
      "name"   : "string",
      "gender" : "string",
      "class"  : "string",
      "major"  : "string",
      "spp"    : "long",
      "createdAt" : "date"
  }
}
```

## List Student

Request :
- Method     : GET
- Endpoint   : 'api/students}'
- Header     :
    - Accept : application/json
- Query Param:
    - size : number,
    - oage : number,
Response :

```json
{
  "code"   : "number",
  "status" : "string", 
  "data"   : [
   {
        "id"     : "string, unique",
        "nisn"   : "string, unique",
        "name"   : "string",
        "gender" : "string",
        "class"  : "string",
        "major"  : "string",
        "spp"    : "long",
        "createdAt" : "date"
    },
   {
        "id"     : "string, unique",
        "nisn"   : "string, unique",
        "name"   : "string",
        "gender" : "string",
        "class"  : "string",
        "major"  : "string",
        "spp"    : "long",
        "createdAt" : "date"
   }
  ]
}
```

## Delete Student
Request :
- Method    : DELETE
- Endpoint  : 'api/students/{nisn_student}'
- Header    :
    - Accept: application/json
Response :

```json
{
  "code" : "number",
  "status": "string"
}
```

**SAMMIDEV**
**2020**