export class Model {
    user;
    items;

    constructor(){
        this.user = "Reşat";
        this.items=[
            new ToDOItem("Spor", false),
            new ToDOItem("Ders", false),
            new ToDOItem("Kahvaltı", false),
            new ToDOItem("Kitap", false),
            
          ];
    }
}

export class ToDOItem {
    description;
    action;

    constructor(description, action){
        this.description = description;
        this.action = action;
       
    }
}