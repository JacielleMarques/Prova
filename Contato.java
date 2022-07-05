classe  pública Contato {

    //Atributos da classe
    privado  int  contato ;
     nome da string  privada ;
     telefone int  privado ;
     e- mail privado String  ;

    //Métodos construtores
     contato público () {}

     contato público ( int contato , String nome , int  telefone , String email ) {   
        isso . contato = contato ;
        isso . nome = nome ;
        isso . telefone = telefone ;
        isso . e- mail = e- mail ;
    }


    //Métodos getters e setters

    public  int  getContatogetContato () {
        retornar  contato ;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}