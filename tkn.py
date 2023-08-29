import tokenize
from io import BytesIO

def tokenize_source_code(source_code):
    tokens = []
    source_bytes = source_code.encode('utf-8')
    source_stream = BytesIO(source_bytes)
    
    for tok in tokenize.tokenize(source_stream.readline):
        tokens.append((tokenize.tok_name[tok.type], tok.string))
    
    return tokens

source_code = """
print(hello world)
"""

tokens = tokenize_source_code(source_code)
for token_type, token_value in tokens:
    print(f"Token type: {token_type}, Token value: {token_value}")
