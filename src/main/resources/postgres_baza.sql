PGDMP                         x           dyplom    12.2    12.2 P    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16396    dyplom    DATABASE     �   CREATE DATABASE dyplom WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Polish_Poland.1250' LC_CTYPE = 'Polish_Poland.1250';
    DROP DATABASE dyplom;
                dyplom    false            �            1259    104905    category    TABLE     Z   CREATE TABLE public.category (
    id bigint NOT NULL,
    name character varying(255)
);
    DROP TABLE public.category;
       public         heap    dyplom    false            �            1259    108476 	   cisnienie    TABLE     `  CREATE TABLE public.cisnienie (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    rodzaj boolean,
    rozkurcz double precision,
    skurcz double precision,
    tetno double precision,
    uwagi character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean
);
    DROP TABLE public.cisnienie;
       public         heap    dyplom    false            �            1259    104910    employee    TABLE     �   CREATE TABLE public.employee (
    id bigint NOT NULL,
    email character varying(255),
    is_active boolean NOT NULL,
    name character varying(255)
);
    DROP TABLE public.employee;
       public         heap    dyplom    false            �            1259    108484    error    TABLE       CREATE TABLE public.error (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    uwagi character varying(255),
    uzytkownik character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean
);
    DROP TABLE public.error;
       public         heap    dyplom    false            �            1259    108474    hibernate_sequence    SEQUENCE     {   CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public          dyplom    false            �            1259    104920    history    TABLE     �   CREATE TABLE public.history (
    id bigint NOT NULL,
    h_data timestamp without time zone,
    h_description character varying(255),
    h_user character varying(255),
    z_id bigint
);
    DROP TABLE public.history;
       public         heap    dyplom    false            �            1259    104918    history_id_seq    SEQUENCE     �   ALTER TABLE public.history ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.history_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          dyplom    false    206            �            1259    108492    index    TABLE     �   CREATE TABLE public.index (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    uzytkownik character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean
);
    DROP TABLE public.index;
       public         heap    dyplom    false            �            1259    108500    info    TABLE       CREATE TABLE public.info (
    id bigint NOT NULL,
    algorytm character varying(255),
    dane_opcje boolean,
    data timestamp without time zone,
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wersja character varying(255),
    wybor boolean
);
    DROP TABLE public.info;
       public         heap    dyplom    false            �            1259    108508    leki    TABLE     T  CREATE TABLE public.leki (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    dawka character varying(255),
    lek character varying(255),
    rodzaj character varying(255),
    uwagi character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean
);
    DROP TABLE public.leki;
       public         heap    dyplom    false            �            1259    108516    nawyki    TABLE     {  CREATE TABLE public.nawyki (
    id bigint NOT NULL,
    dane_opcje boolean,
    data1 timestamp without time zone,
    data2 timestamp without time zone,
    nazwa character varying(255),
    powtorzenia character varying(255),
    realizacja boolean,
    uwagi character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean
);
    DROP TABLE public.nawyki;
       public         heap    dyplom    false            �            1259    108524    profil    TABLE     �  CREATE TABLE public.profil (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    email character varying(255),
    haslo character varying(255),
    imie character varying(255),
    miara character varying(255),
    nazwisko character varying(255),
    plec character varying(255),
    uzytkownik character varying(255),
    uzytkownik_aktywny boolean,
    uzytkownik_d_tw timestamp without time zone,
    uzytkownik_d_cl timestamp without time zone,
    uzytkownik_d_up timestamp without time zone,
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    uzytkownik_typ character varying(255),
    uzytkownik_uwagi character varying(255),
    waga character varying(255),
    wybor boolean
);
    DROP TABLE public.profil;
       public         heap    dyplom    false            �            1259    108532 
   rodzajleku    TABLE     �   CREATE TABLE public.rodzajleku (
    id bigint NOT NULL,
    dane_opcje boolean,
    rodzajlekuu character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean
);
    DROP TABLE public.rodzajleku;
       public         heap    dyplom    false            �            1259    104928    roles    TABLE     ]   CREATE TABLE public.roles (
    role_id integer NOT NULL,
    role character varying(255)
);
    DROP TABLE public.roles;
       public         heap    dyplom    false            �            1259    108540    start    TABLE       CREATE TABLE public.start (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    haslo character varying(255),
    uzytkownik character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean
);
    DROP TABLE public.start;
       public         heap    dyplom    false            �            1259    108548    temperatura    TABLE     %  CREATE TABLE public.temperatura (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    rodzaj boolean,
    temp double precision,
    uwagi character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean
);
    DROP TABLE public.temperatura;
       public         heap    dyplom    false            �            1259    42522    tentno    TABLE     �   CREATE TABLE public.tentno (
    id bigint NOT NULL,
    data timestamp without time zone,
    rodzaj character varying(255),
    tentno double precision NOT NULL,
    uwagi character varying(255)
);
    DROP TABLE public.tentno;
       public         heap    dyplom    false            �            1259    108556    tetno    TABLE     "  CREATE TABLE public.tetno (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    rodzaj boolean,
    tentnoo double precision,
    uwagi character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean
);
    DROP TABLE public.tetno;
       public         heap    dyplom    false            �            1259    104933 	   user_role    TABLE     ^   CREATE TABLE public.user_role (
    user_id integer NOT NULL,
    role_id integer NOT NULL
);
    DROP TABLE public.user_role;
       public         heap    dyplom    false            �            1259    104938    users    TABLE        CREATE TABLE public.users (
    user_id integer NOT NULL,
    active boolean,
    email character varying(255),
    phone character varying(255),
    name character varying(255),
    password character varying(255),
    user_name character varying(255)
);
    DROP TABLE public.users;
       public         heap    dyplom    false            �            1259    108564    waga    TABLE       CREATE TABLE public.waga (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    rodzaj boolean,
    uwagi character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wagaa double precision,
    wybor boolean
);
    DROP TABLE public.waga;
       public         heap    dyplom    false            �            1259    108572    wzrost    TABLE     #  CREATE TABLE public.wzrost (
    id bigint NOT NULL,
    dane_opcje boolean,
    data timestamp without time zone,
    rodzaj boolean,
    uwagi character varying(255),
    uzytkownik_id bigint,
    uzytkownik_prawa character varying(255),
    wybor boolean,
    wzrostt double precision
);
    DROP TABLE public.wzrost;
       public         heap    dyplom    false            �            1259    104948 
   zgloszenie    TABLE       CREATE TABLE public.zgloszenie (
    id bigint NOT NULL,
    archive boolean DEFAULT false,
    c_data date NOT NULL,
    del boolean DEFAULT false,
    description character varying(255),
    email character varying(255),
    end_description character varying(255),
    is_end boolean DEFAULT false,
    is_proceed boolean DEFAULT false,
    name character varying(255),
    phone character varying(255),
    selected_user character varying(255),
    serial_number character varying(255),
    type character varying(255)
);
    DROP TABLE public.zgloszenie;
       public         heap    dyplom    false            �            1259    104960    zgloszenie_histories    TABLE     r   CREATE TABLE public.zgloszenie_histories (
    zgloszenie_id bigint NOT NULL,
    histories_id bigint NOT NULL
);
 (   DROP TABLE public.zgloszenie_histories;
       public         heap    dyplom    false            �            1259    104946    zgloszenie_id_seq    SEQUENCE     �   ALTER TABLE public.zgloszenie ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.zgloszenie_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          dyplom    false    211            �          0    104905    category 
   TABLE DATA           ,   COPY public.category (id, name) FROM stdin;
    public          dyplom    false    203   Ud       �          0    108476 	   cisnienie 
   TABLE DATA           �   COPY public.cisnienie (id, dane_opcje, data, rodzaj, rozkurcz, skurcz, tetno, uwagi, uzytkownik_id, uzytkownik_prawa, wybor) FROM stdin;
    public          dyplom    false    214   rd       �          0    104910    employee 
   TABLE DATA           >   COPY public.employee (id, email, is_active, name) FROM stdin;
    public          dyplom    false    204   �d       �          0    108484    error 
   TABLE DATA           p   COPY public.error (id, dane_opcje, data, uwagi, uzytkownik, uzytkownik_id, uzytkownik_prawa, wybor) FROM stdin;
    public          dyplom    false    215   e       �          0    104920    history 
   TABLE DATA           J   COPY public.history (id, h_data, h_description, h_user, z_id) FROM stdin;
    public          dyplom    false    206   #e       �          0    108492    index 
   TABLE DATA           i   COPY public.index (id, dane_opcje, data, uzytkownik, uzytkownik_id, uzytkownik_prawa, wybor) FROM stdin;
    public          dyplom    false    216   @e       �          0    108500    info 
   TABLE DATA           n   COPY public.info (id, algorytm, dane_opcje, data, uzytkownik_id, uzytkownik_prawa, wersja, wybor) FROM stdin;
    public          dyplom    false    217   ]e       �          0    108508    leki 
   TABLE DATA           w   COPY public.leki (id, dane_opcje, data, dawka, lek, rodzaj, uwagi, uzytkownik_id, uzytkownik_prawa, wybor) FROM stdin;
    public          dyplom    false    218   �e       �          0    108516    nawyki 
   TABLE DATA           �   COPY public.nawyki (id, dane_opcje, data1, data2, nazwa, powtorzenia, realizacja, uwagi, uzytkownik_id, uzytkownik_prawa, wybor) FROM stdin;
    public          dyplom    false    219   f       �          0    108524    profil 
   TABLE DATA             COPY public.profil (id, dane_opcje, data, email, haslo, imie, miara, nazwisko, plec, uzytkownik, uzytkownik_aktywny, uzytkownik_d_tw, uzytkownik_d_cl, uzytkownik_d_up, uzytkownik_id, uzytkownik_prawa, uzytkownik_typ, uzytkownik_uwagi, waga, wybor) FROM stdin;
    public          dyplom    false    220   �f       �          0    108532 
   rodzajleku 
   TABLE DATA           i   COPY public.rodzajleku (id, dane_opcje, rodzajlekuu, uzytkownik_id, uzytkownik_prawa, wybor) FROM stdin;
    public          dyplom    false    221   �h       �          0    104928    roles 
   TABLE DATA           .   COPY public.roles (role_id, role) FROM stdin;
    public          dyplom    false    207   :i       �          0    108540    start 
   TABLE DATA           p   COPY public.start (id, dane_opcje, data, haslo, uzytkownik, uzytkownik_id, uzytkownik_prawa, wybor) FROM stdin;
    public          dyplom    false    222   Wi       �          0    108548    temperatura 
   TABLE DATA           x   COPY public.temperatura (id, dane_opcje, data, rodzaj, temp, uwagi, uzytkownik_id, uzytkownik_prawa, wybor) FROM stdin;
    public          dyplom    false    223   ti       �          0    42522    tentno 
   TABLE DATA           A   COPY public.tentno (id, data, rodzaj, tentno, uwagi) FROM stdin;
    public          dyplom    false    202   �i       �          0    108556    tetno 
   TABLE DATA           u   COPY public.tetno (id, dane_opcje, data, rodzaj, tentnoo, uwagi, uzytkownik_id, uzytkownik_prawa, wybor) FROM stdin;
    public          dyplom    false    224   �i       �          0    104933 	   user_role 
   TABLE DATA           5   COPY public.user_role (user_id, role_id) FROM stdin;
    public          dyplom    false    208   Oj       �          0    104938    users 
   TABLE DATA           Y   COPY public.users (user_id, active, email, phone, name, password, user_name) FROM stdin;
    public          dyplom    false    209   lj       �          0    108564    waga 
   TABLE DATA           r   COPY public.waga (id, dane_opcje, data, rodzaj, uwagi, uzytkownik_id, uzytkownik_prawa, wagaa, wybor) FROM stdin;
    public          dyplom    false    225   �j       �          0    108572    wzrost 
   TABLE DATA           v   COPY public.wzrost (id, dane_opcje, data, rodzaj, uwagi, uzytkownik_id, uzytkownik_prawa, wybor, wzrostt) FROM stdin;
    public          dyplom    false    226   �j       �          0    104948 
   zgloszenie 
   TABLE DATA           �   COPY public.zgloszenie (id, archive, c_data, del, description, email, end_description, is_end, is_proceed, name, phone, selected_user, serial_number, type) FROM stdin;
    public          dyplom    false    211   ;k       �          0    104960    zgloszenie_histories 
   TABLE DATA           K   COPY public.zgloszenie_histories (zgloszenie_id, histories_id) FROM stdin;
    public          dyplom    false    212   Xk       �           0    0    hibernate_sequence    SEQUENCE SET     A   SELECT pg_catalog.setval('public.hibernate_sequence', 32, true);
          public          dyplom    false    213            �           0    0    history_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.history_id_seq', 1, false);
          public          dyplom    false    205            �           0    0    zgloszenie_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.zgloszenie_id_seq', 1, false);
          public          dyplom    false    210            �
           2606    104909    category category_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.category DROP CONSTRAINT category_pkey;
       public            dyplom    false    203                        2606    108483    cisnienie cisnienie_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.cisnienie
    ADD CONSTRAINT cisnienie_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.cisnienie DROP CONSTRAINT cisnienie_pkey;
       public            dyplom    false    214            �
           2606    104917    employee employee_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.employee DROP CONSTRAINT employee_pkey;
       public            dyplom    false    204                       2606    108491    error error_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.error
    ADD CONSTRAINT error_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.error DROP CONSTRAINT error_pkey;
       public            dyplom    false    215            �
           2606    104927    history history_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.history
    ADD CONSTRAINT history_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.history DROP CONSTRAINT history_pkey;
       public            dyplom    false    206                       2606    108499    index index_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.index
    ADD CONSTRAINT index_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.index DROP CONSTRAINT index_pkey;
       public            dyplom    false    216                       2606    108507    info info_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.info
    ADD CONSTRAINT info_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.info DROP CONSTRAINT info_pkey;
       public            dyplom    false    217                       2606    108515    leki leki_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.leki
    ADD CONSTRAINT leki_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.leki DROP CONSTRAINT leki_pkey;
       public            dyplom    false    218            
           2606    108523    nawyki nawyki_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.nawyki
    ADD CONSTRAINT nawyki_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.nawyki DROP CONSTRAINT nawyki_pkey;
       public            dyplom    false    219                       2606    108531    profil profil_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.profil
    ADD CONSTRAINT profil_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.profil DROP CONSTRAINT profil_pkey;
       public            dyplom    false    220                       2606    108539    rodzajleku rodzajleku_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.rodzajleku
    ADD CONSTRAINT rodzajleku_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.rodzajleku DROP CONSTRAINT rodzajleku_pkey;
       public            dyplom    false    221            �
           2606    104932    roles roles_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pkey PRIMARY KEY (role_id);
 :   ALTER TABLE ONLY public.roles DROP CONSTRAINT roles_pkey;
       public            dyplom    false    207                       2606    108547    start start_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.start
    ADD CONSTRAINT start_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.start DROP CONSTRAINT start_pkey;
       public            dyplom    false    222                       2606    108555    temperatura temperatura_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.temperatura
    ADD CONSTRAINT temperatura_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.temperatura DROP CONSTRAINT temperatura_pkey;
       public            dyplom    false    223            �
           2606    42529    tentno tentno_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.tentno
    ADD CONSTRAINT tentno_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.tentno DROP CONSTRAINT tentno_pkey;
       public            dyplom    false    202                       2606    108563    tetno tetno_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.tetno
    ADD CONSTRAINT tetno_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.tetno DROP CONSTRAINT tetno_pkey;
       public            dyplom    false    224            �
           2606    104964 1   zgloszenie_histories uk_4c2cupmrd61yefb6irukw0av4 
   CONSTRAINT     t   ALTER TABLE ONLY public.zgloszenie_histories
    ADD CONSTRAINT uk_4c2cupmrd61yefb6irukw0av4 UNIQUE (histories_id);
 [   ALTER TABLE ONLY public.zgloszenie_histories DROP CONSTRAINT uk_4c2cupmrd61yefb6irukw0av4;
       public            dyplom    false    212            �
           2606    104937    user_role user_role_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT user_role_pkey PRIMARY KEY (user_id, role_id);
 B   ALTER TABLE ONLY public.user_role DROP CONSTRAINT user_role_pkey;
       public            dyplom    false    208    208            �
           2606    104945    users users_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (user_id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            dyplom    false    209                       2606    108571    waga waga_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.waga
    ADD CONSTRAINT waga_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.waga DROP CONSTRAINT waga_pkey;
       public            dyplom    false    225                       2606    108579    wzrost wzrost_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.wzrost
    ADD CONSTRAINT wzrost_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.wzrost DROP CONSTRAINT wzrost_pkey;
       public            dyplom    false    226            �
           2606    104959    zgloszenie zgloszenie_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.zgloszenie
    ADD CONSTRAINT zgloszenie_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.zgloszenie DROP CONSTRAINT zgloszenie_pkey;
       public            dyplom    false    211                       2606    104980 0   zgloszenie_histories fk4a9kxh83d2167q4juh0n6u32i    FK CONSTRAINT     �   ALTER TABLE ONLY public.zgloszenie_histories
    ADD CONSTRAINT fk4a9kxh83d2167q4juh0n6u32i FOREIGN KEY (zgloszenie_id) REFERENCES public.zgloszenie(id);
 Z   ALTER TABLE ONLY public.zgloszenie_histories DROP CONSTRAINT fk4a9kxh83d2167q4juh0n6u32i;
       public          dyplom    false    212    2812    211                       2606    104975 0   zgloszenie_histories fkixomrkx8vdd94relothp6s7aq    FK CONSTRAINT     �   ALTER TABLE ONLY public.zgloszenie_histories
    ADD CONSTRAINT fkixomrkx8vdd94relothp6s7aq FOREIGN KEY (histories_id) REFERENCES public.history(id);
 Z   ALTER TABLE ONLY public.zgloszenie_histories DROP CONSTRAINT fkixomrkx8vdd94relothp6s7aq;
       public          dyplom    false    206    212    2804                       2606    104970 %   user_role fkj345gk1bovqvfame88rcx7yyx    FK CONSTRAINT     �   ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT fkj345gk1bovqvfame88rcx7yyx FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 O   ALTER TABLE ONLY public.user_role DROP CONSTRAINT fkj345gk1bovqvfame88rcx7yyx;
       public          dyplom    false    2810    209    208                       2606    104965 %   user_role fkt7e7djp752sqn6w22i6ocqy6q    FK CONSTRAINT     �   ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT fkt7e7djp752sqn6w22i6ocqy6q FOREIGN KEY (role_id) REFERENCES public.roles(role_id);
 O   ALTER TABLE ONLY public.user_role DROP CONSTRAINT fkt7e7djp752sqn6w22i6ocqy6q;
       public          dyplom    false    2806    207    208            �      x������ � �      �   g   x�U�1
�0�9=�P��Vݼ�'p������:�
��D(�5�V���.x@`��D'Zb���?nK2�艁��]�[)q�IUb:�s���-�s��U$�      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �   A   x�32�4�32�34�L�4202�50�56T00�#�?2�3�L�22�44�� ���<F��� j��      �   M   x�3��L�4202�50"+0�4,IL����q	r��t�+�L��/���,(�J��L�M�L��L���4�=... �q�      �   �   x���K�@D��)���A��� ��lZ`�3D!F���{�����Ԧ_�/Ub)H����'�D�{l�[h�q���Ǥת�G
-mRO�O�d�yc�2ᰕ��m�A���=e&�u�%9F������r1��٭uL��e;�ƚqoʂ��@%��`���ªT�X�B_,;4v�9t	_��u���+�/it      �   �  x�u��n�@���)����`�W&�"@��%E�"Ucl�����7�tپW+J��Ҭ��̧| �	7���7�(iB�)�I4���b0Dx��J"�Il/�1�I$X �.j���5����+�x/_��$���&�h�� ����~�ͥIq�k'%x���8�?��N8F�& ���~P�����h��� �j�6X��e��90���J�U��*�i��8����tZ�^L%W���g�W�*�4~c0�67S�󹡯�mpÌ���>t�6�t�����)�q,���R����'�u(�E!^���Q{�6mKAZ�<�Ppr9lwT���O�Z��S�US��U�ZZ��Y?������leh�p����j7���>JY@ r7U�b������&��GH|EɊ(�0.M�@c>1���VU�P�W���x���G>�9��������
k����WTU	P<�t�����wwL�J@��y^��P�ya��_��W      �   =   x�32�L�t�+�L��/�����4.#s�xxfIbnf^"B�(\Z����W����� ���      �      x������ � �      �      x������ � �      �   J   x�36�L�4202�50�52U02�25�20�,�46�3����4.cCd���i��Hʌ��Y�(3F(����� ��      �      x������ � �      �   T   x�34�L�4202�50�52U00�#�NsN�?J�24CVf�P��in���I��!�2KΨ�ԼԢ���ļ�T��=... ��      �      x������ � �      �      x������ � �      �   P   x���L�4202�50�52U00�#�N�?���L�DVe�E��P���2c��4�Т���̼J�rs=c��=... j�      �   B   x�3�L�4202�50�52U00�#�N�?J�447�2CVf�P���̂�Y�%ve\1z\\\ 
�      �      x������ � �      �      x������ � �     