FROM scireum/s3-ninja:6.4
USER sirius

# Inclua todos os buckets que precisa no comando a seguir

CMD mkdir -p /home/sirius/data/s3 && \
    /home/sirius/run.sh

# O terceiro ponto irá iniciar o processo do S3 Ninja