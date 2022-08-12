package br.com.padraoProjeto.criacionais.builder;

class TesteDoNotaFiscal {
    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Caelum Ensino e Inovação")
        .comCnpj("12.345.678/0001-12")
        .comItem(new ItemDaNota("Item 1", 200.0))
        .comItem(new ItemDaNota("Item 2", 300.0))
        .comItem(new ItemDaNota("Item 3", 400.0))
        .comObservacoes("observacoes")
        .naDataAtual();

        NotaFiscal nf = builder.constroi();

        System.out.println(nf.getValorBruto());
    }
}