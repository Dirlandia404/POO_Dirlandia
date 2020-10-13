package Banco;
class Data {
    private int dia;
    private int mes;
    private int ano;
	private boolean temAnterior = false;
	public Data dataAnterior;

	public boolean isTemAnterior() {
		return this.temAnterior;
	}

	public boolean getTemAnterior() {
		return this.temAnterior;
	}

	public void setTemAnterior(boolean temAnterior) {
		this.temAnterior = temAnterior;
	}

	public Data getDataAnterior() {
		return this.dataAnterior;
	}

	public void setDataAnterior(Data dataAnterior) {
		this.dataAnterior = dataAnterior;
	}
    
	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

	public void setData(int dia, int mes, int ano){
		if(dataPosterior(dia, mes, ano)){
			if(verificarSeExiste()){
				dataAnterior = new Data(this.dia, this.mes, this.ano);
				temAnterior = true;
			}else{
				System.out.printf("Data inválida");
			}
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}else{
			System.out.println("Coloque uma data posterior a antiga");
		}
	}

	public void retrocederData(){
		if(temAnterior){
			this.dia = dataAnterior.getDia();
			this.mes = dataAnterior.getMes();
			this.ano = dataAnterior.getAno();
			if(dataAnterior.getTemAnterior()){
				this.dataAnterior = dataAnterior.getDataAnterior();
			}
			this.temAnterior = dataAnterior.getTemAnterior();
			System.out.println("viagem no tempo");
		}
	}

	public boolean dataPosterior(int dia, int mes, int ano){
		if(this.ano < ano || (this.ano == ano && this.mes < mes) || (this.ano == ano && this.mes == mes && this.dia < dia)){
			return true;
		}else{
			return false;
		}
	}

    public boolean verificarSeExiste() {
		if(ano >= 0) {
			if((mes >= 1) && (mes <=12)) {
				if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
					if (dia >= 1 && dia <= 31) {
						return true;
					}
					else {
						return false;
					}
				}
				else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					if (dia >= 1 && dia <= 30) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					if(ano % 4 != 0) { 
						if(dia >= 1 && dia <= 28) {
							return true;
						} else {
							return false;
						}
					}
					else if(ano % 4 == 0) {
						if(ano % 100 != 0) { 
							if(dia >= 1 && dia <= 29) {
								return true;
							}
							else {
								return false;
							}
						}
						else {

							if(ano % 400 == 0) {
								return true;
							}
							else {
								return false;
							}
						}
					}
				} 
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		return true;
	}
    public void mostrar(){
		if(verificarSeExiste() == true) {
			System.out.println(this.dia+"/"+this.mes+"/"+this.ano);	
		}
		else {
			System.out.println("Data não é válida.");
		}
	}
    
}
