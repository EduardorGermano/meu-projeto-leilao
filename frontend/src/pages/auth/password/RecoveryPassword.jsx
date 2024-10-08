import React from "react";
import "./RecoveryPassword.css";
import { Card } from "primereact/card";
import { InputText } from "primereact/inputtext";
import { Button } from "primereact/button";
import { useNavigate } from "react-router-dom";

const RecoPassoword = () => {
    const handleChange = () => {};
    const navigate = useNavigate();

    return (
        <div className="Body">
            <Card title="Recuperar Senha">
                <div className="grid">
                    <div className="email">
                        <InputText name="email" placeholder="E-Mail:" />
                    </div>
                    <div className="codigo">
                        <InputText onChange={handleChange} name="codigo" placeholder="Codigo de Validação" />
                    </div>
                    <div className="button-container">
                        <Button label="Recuperar Senha" className="p-button" />
                        <Button onClick={() => (navigate("/login"))} label="Cancelar" className="p-button" />
                    </div>
                </div>
            </Card>
        </div>
    );
};

export default RecoPassoword;